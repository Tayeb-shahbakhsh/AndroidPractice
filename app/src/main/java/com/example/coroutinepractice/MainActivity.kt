package com.example.coroutinepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.example.coroutinepractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isUser1 = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_main)

        val user1 = User("Tayeb", "Shahbakhsh", 19)

        val user2 = User("Mamad", "Alizadeh", 23)
        
        binding.user = user1

        binding.changeUserBtn.setOnClickListener {
            binding.user = if (isUser1) user2 else user1
            isUser1 = isUser1.not()
        }
    }
}