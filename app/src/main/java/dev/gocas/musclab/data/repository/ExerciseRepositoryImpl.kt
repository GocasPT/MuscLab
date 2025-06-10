package dev.gocas.musclab.data.repository

import dev.gocas.musclab.data.database.dao.ExerciseDao
import dev.gocas.musclab.data.database.model.ExerciseEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ExerciseRepositoryImpl(private val dao: ExerciseDao) : ExerciseRepository {
    override fun getAllExercises() = dao.getAllExercises()

    override suspend fun insert(exercise: ExerciseEntity) = withContext(Dispatchers.IO) {
        try {
            dao.insert(exercise)
        } catch (e: Exception) {
            TODO("Not yet implemented")
            throw RuntimeException("Failed to insert exercise", e)
        }
    }

    override suspend fun update(exercise: ExerciseEntity) = withContext(Dispatchers.IO) {
        try {
            dao.update(exercise)
        } catch (e: Exception) {
            TODO("Not yet implemented")
            throw RuntimeException("Failed to update exercise", e)
        }
    }

    override suspend fun delete(exercise: ExerciseEntity) = withContext(Dispatchers.IO) {
        try {
            dao.delete(exercise)
        } catch (e: Exception) {
            TODO("Not yet implemented")
            throw RuntimeException("Failed to delete exercise", e)
        }
    }
}