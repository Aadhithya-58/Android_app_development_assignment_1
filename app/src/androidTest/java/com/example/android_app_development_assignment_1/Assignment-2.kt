package com.example.android_app_development_assignment_1
import android.os.Bundle
import android.widget.Button import android.widget.ImageView
import android.widget.TextView
import androidx.activity. ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3. Surface
import androidx.compose.material3. Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview. Preview
import com.example.android_app_development_assignment_1.ui.theme.dice
import java.util.Random
//https://stackoverflow.com/questions/16906528/change-image-of-imageview- programmatically-in-android
//In layout page don't set any image for the imageview when dynamically images are to be displayed
class Dice1: ComponentActivity() {
    private lateinit var ResultText: TextView
    private lateinit var RollButton: Button
    private lateinit var Dice2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) setContentView(R.layout.activity_main)
        ResultText =
            findViewById(R.id.ResultText) RollButton = findViewById (R.id.RollButton) DiceImage = findViewById (R.id.DiceImage)
        RollButton.setOnClickListener {
            rollDice()
        }
    }
}
private fun rollDice () {
    val random =
        Random() //Random function will generate numbers from 0 to bound-1 val randomNumber = random.nextInt(6) + 1 //+1 is added to obtain the answer
    //from 1 to 6.
//If 0 is generated by the function then the answer displayed will be 1
    val resultText = "You have rolled $random"
    resultText.text = resultText
    if (randomNumber == 1) {
        Dice2.setBackgroundResource(R.drawable.number1)
    }
//The above function call helps us retrieve an image from drawables folder
    else if (randomNumber == 2) {
        Dice2.setBackgroundResource(R.drawable.number2)
    }
    else if (randomNumber == 3) {
        Dice2.setBackgroundResource(R.drawable.number3)
    }
}