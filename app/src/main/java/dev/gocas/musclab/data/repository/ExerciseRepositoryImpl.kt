package dev.gocas.musclab.data.repository

import dev.gocas.musclab.data.database.dao.ExerciseDao
import dev.gocas.musclab.data.database.model.ExerciseEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ExerciseRepositoryImpl(private val dao: ExerciseDao) : ExerciseRepository {
    override fun getAllExercises() = dao.getAllExercises()

    override suspend fun insert(exercise: ExerciseEntity) = withContext(Dispatchers.IO) {
        dao.insert(exercise)
    }

    override suspend fun update(exercise: ExerciseEntity) = withContext(Dispatchers.IO) {
        dao.update(exercise)
    }

    override suspend fun delete(exercise: ExerciseEntity) = withContext(Dispatchers.IO) {
        dao.delete(exercise)
    }
}