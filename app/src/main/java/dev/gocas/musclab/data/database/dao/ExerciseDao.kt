package dev.gocas.musclab.data.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import dev.gocas.musclab.data.database.model.ExerciseEntity;
import kotlinx.coroutines.flow.Flow;

@Dao
interface ExerciseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(exercise: ExerciseEntity);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(exercise: ExerciseEntity);

    @Delete
    suspend fun delete(exercise: ExerciseEntity);

    @Query("SELECT * FROM exercise ORDER BY id DESC")
    fun getAllExercises(): Flow<List<ExerciseEntity>>;
}
