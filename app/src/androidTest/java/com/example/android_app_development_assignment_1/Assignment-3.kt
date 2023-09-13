package com.example.android_app_development_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.android_app_development_assignment_1.ui.theme.Android_app_development_assignment_1Theme
@OptIn(ExperimentalMaterial3Api::class)
class App : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_app_development_assignment_1Theme {
                // Initialize username and password fields with empty values
                var username by remember { mutableStateOf(TextFieldValue()) }
                var password by remember { mutableStateOf(TextFieldValue()) }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(
                        value = username,
                        onValueChange = { username = it},
                        modifier = Modifier.padding(16.dp),
                        singleLine = true,
                        placeholder = { Text("Username") }
                    )

                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        modifier = Modifier.padding(16.dp),
                        singleLine = true,
                        placeholder = { Text("Password") }
                    )

                    Button(
                        onClick = {
                            // Handle the Amazon button click here
                        },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("Amazon")
                    }

                    Button(
                        onClick = {
                            // Handle the Twitter button click here
                        },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("Twitter")
                    }

                    Button(
                        onClick = {
                            // Handle the Facebook button click here
                        },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("Facebook")
                    }
                }
            }
        }
    }
}