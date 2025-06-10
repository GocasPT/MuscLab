package dev.gocas.musclab

import dev.gocas.musclab.data.database.dao.ExerciseDao
import dev.gocas.musclab.data.database.model.ExerciseEntity
import dev.gocas.musclab.data.repository.ExerciseRepositoryImpl
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.*

@ExperimentalCoroutinesApi
class ExerciseRepositoryImplTest {
    private lateinit var exerciseDao: ExerciseDao
    private lateinit var exerciseRepository: ExerciseRepositoryImpl
    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        exerciseDao = mock()
        exerciseRepository = ExerciseRepositoryImpl(exerciseDao)
        Dispatchers.setMain(testDispatcher) // Set main dispatcher for coroutine testing
    }

    @Test
    fun `getAllExercises returns flow of exercises from DAO`() = runTest {
        val exercises = listOf(
            ExerciseEntity(1, "Push-ups", "Bodyweight exercise"),
            ExerciseEntity(2, "Squats", "Leg exercise")
        )
        whenever(exerciseDao.getAllExercises()).thenReturn(flowOf(exercises))

        val result = exerciseRepository.getAllExercises().first()

        assertEquals(exercises, result)
        verify(exerciseDao).getAllExercises()
    }

    @Test
    fun `insert calls dao insert with correct exercise`() = runTest {
        val exercise = ExerciseEntity(1, "Bench Press", "Chest exercise")

        exerciseRepository.insert(exercise)
        advanceUntilIdle() // Ensure coroutine completes

        verify(exerciseDao).insert(exercise)
    }

    @Test
    fun `update calls dao update with correct exercise`() = runTest {
        val exercise = ExerciseEntity(1, "Deadlift", "Back exercise")

        exerciseRepository.update(exercise)
        advanceUntilIdle()

        verify(exerciseDao).update(exercise)
    }

    @Test
    fun `delete calls dao delete with correct exercise`() = runTest {
        val exercise = ExerciseEntity(1, "Bicep Curl", "Arm exercise")

        exerciseRepository.delete(exercise)
        advanceUntilIdle()

        verify(exerciseDao).delete(exercise)
    }
}