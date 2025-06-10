package dev.gocas.musclab.data.repository

import dev.gocas.musclab.data.database.model.ExerciseEntity
import kotlinx.coroutines.flow.Flow

interface ExerciseRepository {
    fun getAllExercises(): Flow<List<ExerciseEntity>>
    suspend fun insert(exercise: ExerciseEntity)
    suspend fun update(exercise: ExerciseEntity)
    suspend fun delete(exercise: ExerciseEntity);
}