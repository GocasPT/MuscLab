package dev.gocas.musclab.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.gocas.musclab.data.database.dao.ExerciseDao
import dev.gocas.musclab.data.database.model.ExerciseEntity

@Database(entities = [ExerciseEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
}