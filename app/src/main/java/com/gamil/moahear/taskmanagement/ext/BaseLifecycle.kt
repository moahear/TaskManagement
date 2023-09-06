package com.gamil.moahear.taskmanagement.ext

//for connect presenter lifecycle to activity lifecycle
interface BaseLifecycle {
    fun onCreate()
    fun onDestroy()
    fun onStop()
}