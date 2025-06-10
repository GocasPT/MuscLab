package dev.gocas.musclab.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.gocas.musclab.data.database.model.ExerciseEntity
import dev.gocas.musclab.data.repository.ExerciseRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExerciseViewModel @Inject constructor(
    private val exerciseRepository: ExerciseRepository
) : ViewModel() {
    private val _exercises = MutableStateFlow<List<ExerciseEntity>>(emptyList())
    private var exercisesJob: Job? = null
    val exercises: StateFlow<List<ExerciseEntity>> = _exercises

    init {
        loadExercises()
    }

    private fun loadExercises() {
        exercisesJob?.cancel()
        exercisesJob = viewModelScope.launch {
            exerciseRepository.getAllExercises()
                .collect { exercises -> _exercises.value = exercises }
        }
    }
}