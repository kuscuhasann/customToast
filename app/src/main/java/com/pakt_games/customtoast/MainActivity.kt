package com.pakt_games.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.pakt_games.customtoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        bindingMain.buttonShowToast.setOnClickListener {
            val toast = Toast(this)
            val view = LayoutInflater.from(this).inflate(R.layout.custom_toast_layout, null)
            toast.view = view
            toast.show()
        }
    }
}