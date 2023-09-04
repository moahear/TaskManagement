package com.gamil.moahear.taskmanagement.view

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.Toast
import com.gamil.moahear.taskmanagement.R
import com.gamil.moahear.taskmanagement.databinding.ActivityMainBinding
import com.gamil.moahear.taskmanagement.databinding.CustomDialogBinding

class ViewMainActivity(context:Context):FrameLayout(context) {
    val binding=ActivityMainBinding.inflate(LayoutInflater.from(context))
    fun showAddNewTaskDialog(){
        //show dialog add new task
        binding.apply {
            fabAddTask.setOnClickListener {
                val view=CustomDialogBinding.inflate(LayoutInflater.from(context))
                val dialog=Dialog(context)
                dialog.apply {
                    setContentView(view.root)
                    setCancelable(false)
                    //show corner correctly
                    window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    //show width correctly
                    val width = (resources.displayMetrics.widthPixels*0.9f).toInt()
                    val height = WindowManager.LayoutParams.WRAP_CONTENT
                    window?.setLayout(width, height)
                    show()
                }

                //save or cancel new task
                view.apply {
                    btnCancel.setOnClickListener { dialog.dismiss() }
                    btnSave.setOnClickListener {
                        val taskText=edtNewTask.text.toString()
                        if (taskText.isNotEmpty()){
                            //save to database

                            dialog.dismiss()
                        }
                        else{
                            Toast.makeText(context,
                                context.getString(R.string.show_write_new_task), Toast.LENGTH_SHORT).show()
                        }
                    }
                }


            }
        }
    }
}