package com.experimento.firebaseauthfirestore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.experimento.firebaseauthfirestore.ui.theme.FirebaseAuthFirestoreTheme

class WelcomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirebaseAuthFirestoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val context = LocalContext.current


    Column (
        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Bem-vindo ao programa experimental Firebase",
            modifier = modifier
        )

        Row {
            Button(
                onClick = {
                    val intent = Intent(context,SingUpActivity::class.java)
                    context.startActivity(intent)
                }
            ) {
                Text(
                    text = "Cadastro"
                )
            }

            Spacer(modifier = Modifier.size(12.dp))

            Button(
                onClick = {
                    val intent = Intent (context, SingInActivity::class.java)
                    context.startActivity(intent)
                }
            ) {
                Text(
                    text = "Entrar"
                )
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirebaseAuthFirestoreTheme {
        Greeting("Android")
    }
}