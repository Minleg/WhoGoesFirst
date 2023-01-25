package com.example.whogoesfirst

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var teamName1EditText: EditText
    private lateinit var teamName2EditText: EditText
    private lateinit var chooseTeamButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize here
        teamName1EditText = findViewById(R.id.teamNameOneEditText)
        teamName2EditText = findViewById(R.id.teamNameTwoEditText)
        chooseTeamButton = findViewById(R.id.whoGoesFirstButton)
        resultTextView = findViewById(R.id.resutlTextView)

        chooseTeamButton.setOnClickListener {
            chooseRandomTeam()
        }
    }

    private fun chooseRandomTeam() {
        // get team 1 name
        val team1Name = teamName1EditText.text.toString()
        // get team 2 name
        val team2Name = teamName2EditText.text.toString()

        // make sure both names are filled in
        if (team1Name.isBlank() || team2Name.isBlank()) {
            //  show a toast
            Toast.makeText(this, "Team can't be blank", Toast.LENGTH_SHORT).show()
        } else {
            // show a random team
            val teams = listOf(team1Name, team2Name)
            // choose a random team
            val chosenTeam = teams.random()
            resultTextView.text = chosenTeam
        }
        // if so, choose a random team
        // else, show error toast
    }
}
