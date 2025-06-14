package dev.gocas.musclab.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.gocas.musclab.data.database.AppDatabase
import dev.gocas.musclab.data.repository.ExerciseRepository
import dev.gocas.musclab.data.repository.ExerciseRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "musclab-db")
            .build()
    }

    @Provides
    @Singleton
    fun provideExerciseRepository(database: AppDatabase): ExerciseRepository {
        return ExerciseRepositoryImpl(database.exerciseDao())
    }
}