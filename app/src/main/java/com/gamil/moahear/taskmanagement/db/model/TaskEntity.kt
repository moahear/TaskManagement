package com.gamil.moahear.taskmanagement.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gamil.moahear.taskmanagement.ext.TASK_TABLE

@Entity(tableName = TASK_TABLE)
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    @ColumnInfo(name = "task_state")
    val taskState: Boolean
)
