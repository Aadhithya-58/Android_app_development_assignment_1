package com.example.android_app_development_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_app_development_assignment_1.ui.theme.Android_app_development_assignment_1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column(modifier= Modifier
                .fillMaxSize()
                .background(Color.White),
                horizontalAlignment= Alignment.CenterHorizontally,verticalArrangement=Arrangement.Center){
                loginText()
                loginTextField()
                Column(horizontalAlignment=Alignment.CenterHorizontally){
                    loginButton()
            }
            }
        }
    }

}

@Composable
fun loginText()
{
    Text(text="Login",modifier= Modifier.run { padding(5.dp) },fontSize=48.sp)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginTextField(){
    var user:String by remember{mutableStateOf(value="")}
    var pass:String by remember{ mutableStateOf(value="") }
    Column(horizontalAlignment=Alignment.CenterHorizontally,verticalArrangement= Arrangement.Center){
        OutlinedTextField(value =user, onValueChange ={it->user=it}, label ={ Text(text = "Username")})
        Spacer(modifier = Modifier.padding(vertical=5.dp))
        OutlinedTextField(value =pass, onValueChange ={it->pass=it},label={Text(text="Password")} )
    }
}

@Composable
fun loginButton(){
    Button(modifier=Modifier.padding(16.dp),onClick={/*TODO*/})
    {
        Text(text="Submit")
    }
}

@Preview
@Composable
fun loginPreview(){
    Column(modifier= Modifier
        .fillMaxSize()
        .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
    {
        loginText()
        loginTextField()
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            loginButton()
        }
    }
}