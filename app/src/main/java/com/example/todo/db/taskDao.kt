package com.example.todo.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
/*
@Dao
interface taskDao {
    @Insert
    suspend fun insertTask()

    @Update
    suspend fun updateTask()

    @Delete
    suspend fun deleteTask()

    @Query("select * from tasks where taskId=:taskId")
    fun findTask(taskId:Int) : Task

    @Query("select * from tasks")
    fun getAllTasks() : Task
}

 */