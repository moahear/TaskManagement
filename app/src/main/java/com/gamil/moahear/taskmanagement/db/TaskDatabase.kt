package com.gamil.moahear.taskmanagement.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gamil.moahear.taskmanagement.db.dao.TaskDao
import com.gamil.moahear.taskmanagement.db.model.TaskEntity
import com.gamil.moahear.taskmanagement.ext.TASK_DATABASE
import com.gamil.moahear.taskmanagement.ext.TASK_DATABASE_VERSION

@Database(entities = [TaskEntity::class], version = TASK_DATABASE_VERSION, exportSchema = false)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun TaskDao(): TaskDao

    companion object {
        private var instance: TaskDatabase? = null
        fun getTaskDatabase(context: Context): TaskDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context = context, TaskDatabase::class.java,
                    TASK_DATABASE
                )
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance!!
        }
    }

}