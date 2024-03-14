package com.example.latihan3pam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.latihan3pam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Variabel binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menginisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Mengakses elemen UI melalui variabel binding
        binding.textView.text = "Hello, View Binding!"
        binding.button.setOnClickListener {
            Log.d("com.example.latihan3pam.MainActivity", "Button clicked")
        }
    }
}