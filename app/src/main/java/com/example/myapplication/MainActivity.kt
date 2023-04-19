package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView =
            findViewById<BottomNavigationView>(R.id.button)

        val controller = findNavController(R.id.button)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.firstfragment,
                R.id.secondfragment,
                R.id.thirdfragment
            )
        )


        setupActionBarWithNavController(controller, appBarConfiguration)
        bottomNavigationView.setupWithNavController(controller)
    }
    }




