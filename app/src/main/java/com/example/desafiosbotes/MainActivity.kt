package com.example.desafiosbotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.desafiosbotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickButton()
        supportActionBar!!.hide()
    }

    fun clickButton() {

        binding.buttonEu.setOnClickListener {
            binding.textEu.text = "EU"
        }

        binding.buttonVou.setOnClickListener {
            binding.textVou.text = "VOU"
        }

        binding.buttonVirar.setOnClickListener {
            binding.textVirar.text = "VIRAR"
        }

        binding.buttonDev.setOnClickListener {
            binding.textDev.text = "DEV"
        }

    }


}