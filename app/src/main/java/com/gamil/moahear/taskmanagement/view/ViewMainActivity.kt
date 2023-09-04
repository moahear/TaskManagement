package com.gamil.moahear.taskmanagement.view

import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.gamil.moahear.taskmanagement.databinding.ActivityMainBinding

class ViewMainActivity(context:Context):FrameLayout(context) {
    val binding=ActivityMainBinding.inflate(LayoutInflater.from(context))
}