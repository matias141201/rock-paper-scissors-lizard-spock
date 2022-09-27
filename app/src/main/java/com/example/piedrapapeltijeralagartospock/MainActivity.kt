package com.example.piedrapapeltijeralagartospock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.piedrapapeltijeralagartospock.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val lightTheme = AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val screenSplash = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        screenSplash.setKeepOnScreenCondition { false }
        lightTheme
        select()
        backgroundColor()

        binding.btNext.setOnClickListener {
            val Bundle = intent.extras
            val idUser = Bundle?.get("intentId")
            val userId = idUser.toString().toInt()
            if (userId > 0) {
                val intent = Intent(this, rockPaperScissorsLizardSpockMainActivity::class.java)
                intent.putExtra("idIntent", userId.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "selecione uno", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun select() {
        var id = 0
        intent.putExtra("intentId", id.toString())

        binding.ivSpock.setOnClickListener {
            backgroundColor()
            binding.ivSpock.setBackgroundColor(ContextCompat.getColor(this, R.color.Yellow))
            backgroundButton()
            id = 1
            intent.putExtra("intentId", id.toString())
        }
        binding.ivRock.setOnClickListener {
            backgroundColor()
            binding.ivRock.setBackgroundColor(ContextCompat.getColor(this, R.color.Yellow))
            backgroundButton()
            id = 2
            intent.putExtra("intentId", id.toString())
        }
        binding.ivScissors.setOnClickListener {
            backgroundColor()
            binding.ivScissors.setBackgroundColor(ContextCompat.getColor(this, R.color.Yellow))
            backgroundButton()
            id = 3
            intent.putExtra("intentId", id.toString())
        }
        binding.ivPaper.setOnClickListener {
            backgroundColor()
            binding.ivPaper.setBackgroundColor(ContextCompat.getColor(this, R.color.Yellow))
            backgroundButton()
            id = 4
            intent.putExtra("intentId", id.toString())
        }
        binding.ivLizard.setOnClickListener {
            backgroundColor()
            binding.ivLizard.setBackgroundColor(ContextCompat.getColor(this, R.color.Yellow))
            backgroundButton()
            id = 5
            intent.putExtra("intentId", id.toString())
        }
    }

    fun backgroundButton() {
        binding.btNext.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
    }

    fun backgroundColor() {
        binding.ivSpock.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        binding.ivRock.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        binding.ivScissors.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        binding.ivPaper.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
        binding.ivLizard.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
    }
}