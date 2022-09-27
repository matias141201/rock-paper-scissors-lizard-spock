package com.example.piedrapapeltijeralagartospock

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.piedrapapeltijeralagartospock.databinding.ActivityRockPaperScissorsLizardSpockMainBinding

class rockPaperScissorsLizardSpockMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRockPaperScissorsLizardSpockMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRockPaperScissorsLizardSpockMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        whoWin()

        binding.btHome.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }

    }

    fun whoWin() {
        val Bundle = intent.extras
        val id = Bundle?.get("idIntent")
        val userId = id.toString().toInt()
        val comChoice = (1..5).random()
        /*
        spock = 1
        rock = 2
        scissors = 3
        paper = 4
        lizard = 5
         */
        when {

            userId == 3 && comChoice == 4 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "tijera corta papel"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.scissors)
                binding.ivComChoice.setImageResource(R.drawable.paper)
            }
            userId == 4 && comChoice == 2 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "papel cubre roca"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.paper)
                binding.ivComChoice.setImageResource(R.drawable.rock)
            }
            userId == 2 && comChoice == 5 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "roca aplasta lagarto"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.rock)
                binding.ivComChoice.setImageResource(R.drawable.lizard)
            }
            userId == 5 && comChoice == 1 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "lagarto envenena a spock"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.lizard)
                binding.ivComChoice.setImageResource(R.drawable.spock)
            }
            userId == 1 && comChoice == 3 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "spock aplasta tijeras"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.spock)
                binding.ivComChoice.setImageResource(R.drawable.scissors)
            }
            userId == 3 && comChoice == 5 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "tijeras decapitan lagarto"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.scissors)
                binding.ivComChoice.setImageResource(R.drawable.lizard)
            }
            userId == 5 && comChoice == 4 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "lagarto come papel"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.lizard)
                binding.ivComChoice.setImageResource(R.drawable.paper)
            }
            userId == 4 && comChoice == 1 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "papel desaprueba a spock"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.paper)
                binding.ivComChoice.setImageResource(R.drawable.spock)
            }
            userId == 1 && comChoice == 2 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "spock vaporiza piedra"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.spock)
                binding.ivComChoice.setImageResource(R.drawable.rock)
            }
            userId == 2 && comChoice == 3 -> {
                binding.tvWinOrLose.text = "ganaste"
                binding.tvWinOrLoseDescription.text = "piedra aplasta tijeras"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.rock)
                binding.ivComChoice.setImageResource(R.drawable.scissors)
            }
            userId == 4 && comChoice == 3 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "tijera corta papel"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.paper)
                binding.ivComChoice.setImageResource(R.drawable.scissors)
            }
            userId == 2 && comChoice == 4 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "papel cubre roca"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.rock)
                binding.ivComChoice.setImageResource(R.drawable.paper)
            }
            userId == 5 && comChoice == 2 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "roca aplasta lagarto"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.lizard)
                binding.ivComChoice.setImageResource(R.drawable.rock)
            }
            userId == 1 && comChoice == 5 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "lagarto envenena a spock"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.spock)
                binding.ivComChoice.setImageResource(R.drawable.lizard)
            }
            userId == 3 && comChoice == 1 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "spock aplasta tijeras"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.scissors)
                binding.ivComChoice.setImageResource(R.drawable.spock)
            }
            userId == 5 && comChoice == 3 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "tijeras decapitan lagarto"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.lizard)
                binding.ivComChoice.setImageResource(R.drawable.scissors)
            }
            userId == 4 && comChoice == 5 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "lagarto come papel"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.paper)
                binding.ivComChoice.setImageResource(R.drawable.lizard)
            }
            userId == 1 && comChoice == 4 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "papel desaprueba a spock"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.spock)
                binding.ivComChoice.setImageResource(R.drawable.paper)
            }
            userId == 2 && comChoice == 1 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "spock vaporiza piedra"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.rock)
                binding.ivComChoice.setImageResource(R.drawable.spock)
            }
            userId == 3 && comChoice == 2 -> {
                binding.tvWinOrLose.text = "perdiste"
                binding.tvWinOrLoseDescription.text = "piedra aplasta tijeras"
                winOrLoseBackground()
                binding.ivUserChoice.setImageResource(R.drawable.scissors)
                binding.ivComChoice.setImageResource(R.drawable.rock)
            }
            userId == 1 && comChoice == 1 -> {
                binding.tvWinOrLose.text = "empate"
                binding.ivUserChoice.setImageResource(R.drawable.spock)
                binding.ivComChoice.setImageResource(R.drawable.spock)
            }
            userId == 2 && comChoice == 2 -> {
                binding.tvWinOrLose.text = "empate"
                binding.ivUserChoice.setImageResource(R.drawable.rock)
                binding.ivComChoice.setImageResource(R.drawable.rock)
            }
            userId == 3 && comChoice == 3 -> {
                binding.tvWinOrLose.text = "empate"
                binding.ivUserChoice.setImageResource(R.drawable.scissors)
                binding.ivComChoice.setImageResource(R.drawable.scissors)
            }
            userId == 4 && comChoice == 4 -> {
                binding.tvWinOrLose.text = "empate"
                binding.ivUserChoice.setImageResource(R.drawable.paper)
                binding.ivComChoice.setImageResource(R.drawable.paper)
            }
            userId == 5 && comChoice == 5 -> {
                binding.tvWinOrLose.text = "empate"
                binding.ivUserChoice.setImageResource(R.drawable.lizard)
                binding.ivComChoice.setImageResource(R.drawable.lizard)
            }
        }
    }

    fun winOrLoseBackground() {

        if (binding.tvWinOrLose.text == "ganaste") {
            binding.tvWinOrLose.setTextColor(Color.parseColor("#019107"))
        } else if (binding.tvWinOrLose.text == "perdiste") {
            binding.tvWinOrLose.setTextColor(Color.parseColor("#D30101"))
        }
    }
}