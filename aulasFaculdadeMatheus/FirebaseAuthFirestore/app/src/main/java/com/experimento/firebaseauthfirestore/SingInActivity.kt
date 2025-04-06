package com.experimento.firebaseauthfirestore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.experimento.firebaseauthfirestore.ui.theme.FirebaseAuthFirestoreTheme

class SingInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirebaseAuthFirestoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
//        Text(text = "E-mail:")
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("E-mail:") }
        )
//        Text(text = "Senha:")
        OutlinedTextField(
            value = senha,
            onValueChange = { senha = it },
            label = { Text("Senha:") }
        )

        Spacer(modifier = Modifier.size(12.dp))
        Button(
            onClick = {}
        ) {
            Text(text = "Entrar")
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    FirebaseAuthFirestoreTheme {
        Greeting2("Android")
    }
}