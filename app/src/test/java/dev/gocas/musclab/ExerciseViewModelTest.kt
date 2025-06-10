package dev.gocas.musclab

import dev.gocas.musclab.data.database.model.ExerciseEntity
import dev.gocas.musclab.data.repository.ExerciseRepository
import dev.gocas.musclab.viewmodel.ExerciseViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

@ExperimentalCoroutinesApi
class ExerciseViewModelTest {
    private lateinit var exerciseRepository: ExerciseRepository
    private lateinit var exerciseViewModel: ExerciseViewModel
    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        exerciseRepository = mock()
        Dispatchers.setMain(testDispatcher) // Set main dispatcher for coroutine testing
    }

    @Test
    fun `loadExercises updates exercises StateFlow correctly`() = runTest {
        val exercises = listOf(
            ExerciseEntity(1, "Run", "Cardio"),
            ExerciseEntity(2, "Swim", "Full body")
        )
        val flowOfExercises = MutableStateFlow(exercises)

        // Mock the repository to return our test data
        whenever(exerciseRepository.getAllExercises()).thenReturn(flowOfExercises)

        // Initialize the ViewModel *after* mocking the repository's behavior
        // because init block of ViewModel will call loadExercises
        exerciseViewModel = ExerciseViewModel(exerciseRepository)

        advanceUntilIdle() // Allow coroutines to complete

        assertEquals(exercises, exerciseViewModel.exercises.first())
    }

    @Test
    fun `loadExercises handles empty list gracefully`() = runTest {
        val emptyExercises = emptyList<ExerciseEntity>()
        val flowOfEmptyExercises = MutableStateFlow(emptyExercises)

        whenever(exerciseRepository.getAllExercises()).thenReturn(flowOfEmptyExercises)

        exerciseViewModel = ExerciseViewModel(exerciseRepository)

        advanceUntilIdle()

        assertEquals(emptyExercises, exerciseViewModel.exercises.first())
    }
}