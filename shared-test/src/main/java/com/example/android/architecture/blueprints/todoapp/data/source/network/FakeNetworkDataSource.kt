

package com.nanicki.todoapp.data.source.network

import com.nanicki.todoapp.data.source.network.NetworkDataSource
import com.nanicki.todoapp.data.source.network.NetworkTask

class FakeNetworkDataSource(
    var tasks: MutableList<NetworkTask>? = mutableListOf()
) : NetworkDataSource {
    override suspend fun loadTasks() = tasks ?: throw Exception("Task list is null")

    override suspend fun saveTasks(tasks: List<NetworkTask>) {
        this.tasks = tasks.toMutableList()
    }
}
