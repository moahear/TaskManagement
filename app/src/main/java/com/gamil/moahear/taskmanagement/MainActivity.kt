package com.gamil.moahear.taskmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gamil.moahear.taskmanagement.model.ModelMainActivity
import com.gamil.moahear.taskmanagement.presenter.PresenterMainActivity
import com.gamil.moahear.taskmanagement.view.ViewMainActivity

class MainActivity : AppCompatActivity() {
    private lateinit var presenter:PresenterMainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view=ViewMainActivity(this)
        setContentView(view.binding.root)
        presenter=PresenterMainActivity(view, ModelMainActivity(this))
        presenter.onCreate()
    }
}