package com.gamil.moahear.taskmanagement.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.gamil.moahear.taskmanagement.db.TaskDatabase
import com.gamil.moahear.taskmanagement.db.model.TaskEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert
    fun insertTask(vararg taskEntity: TaskEntity)

    @get:Query("SELECT * FROM TASK_TABLE")
    val getTasks: Flow<List<TaskDatabase>>

    @Query("SELECT * FROM TASK_TABLE WHERE task_state= :state")
    fun getTaskByState(state: Boolean): Flow<List<TaskDatabase>>

    @Update
    fun updateTask(vararg taskEntity: TaskEntity): Int

    @Delete
    fun deleteTask(vararg taskEntity: TaskEntity): Int

    @Query("DELETE FROM TASK_TABLE")
    fun deleteAllTasks()

}