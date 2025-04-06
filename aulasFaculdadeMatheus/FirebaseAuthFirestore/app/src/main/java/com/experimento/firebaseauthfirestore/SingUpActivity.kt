package com.experimento.firebaseauthfirestore

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.experimento.firebaseauthfirestore.ui.theme.FirebaseAuthFirestoreTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SingUpActivity : ComponentActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        auth = Firebase.auth

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirebaseAuthFirestoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting3(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
        if (currentUser != null) {
//            reload()
        }
    }

    private fun updateUI(user: User) {
        
    }

    private fun creatAccount(email: String, senha: String) {
        auth.createUserWithEmailAndPassword(email, senha)
            .addOnCompleteListener(this) {task ->
                if (task.isSuccessful) {
                    Log.d("AUTH-INFO", "createUserWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    Log.w("AUTH-INFO", "createUserWithEmail:failure", task.exception)
                    Toast.makeText(
                        baseContext,
                        "Authentication failed.",
                        Toast.LENGTH_SHORT,
                    ).show()
                    updateUI(null)
                }
            }
    }

}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    var nome by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var rg by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = nome,
            onValueChange = {nome = it},
            label = { Text("Nome:") }
        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it},
            label = { Text("E-mail:") }
        )

        OutlinedTextField(
            value = senha,
            onValueChange = {senha = it},
            label = { Text("Senha:") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        OutlinedTextField(
            value = rg,
            onValueChange = {rg = it},
            label = { Text("RG:") }
        )

        OutlinedTextField(
            value = cpf,
            onValueChange = {cpf = it},
            label = { Text("CPF:") }
        )

        Spacer(modifier = Modifier.size(12.dp))
        Button(
            onClick = {

            }
        ) {
            Text(text = "Criar Minha Conta")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    FirebaseAuthFirestoreTheme {
        Greeting3("Android")
    }
}