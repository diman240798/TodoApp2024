package com.nanicki.todoapp.di

import com.nanicki.todoapp.data.FakeTaskRepository
import com.nanicki.todoapp.data.TaskRepository
import com.nanicki.todoapp.di.RepositoryModule
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [RepositoryModule::class]
)
object RepositoryTestModule {

    @Singleton
    @Provides
    fun provideTasksRepository(): TaskRepository {
        return FakeTaskRepository()
    }
}
