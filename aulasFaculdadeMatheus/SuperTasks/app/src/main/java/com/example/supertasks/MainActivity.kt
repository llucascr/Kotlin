package com.example.supertasks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.supertasks.ui.theme.SuperTasksTheme
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperTasksTheme {
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

fun createTestAccount() {
    val auth = Firebase.auth
    auth.createUserWithEmailAndPassword(
        "teste@teste.com.br", "1234567qwerty")
        .addOnCompleteListener {task ->
            if (task.isSuccessful) {
                Log.i("AUTH-INFO",
                    "Usuario criado com suscesso: ${task.result.user!!.uid}")
            }else {
                Log.e("AUTH-INFO", "ERRO ao criar o usuário: " +
                        "${task.exception}")
            }
        }
}

fun addNewTestTask() {
    // Referencia do singleton firestore
    val db = Firebase.firestore

    val taskTestDoc = hashMapOf(
        "nome" to "Nome da tarefa de testes...",
        "descrição" to "Descrição teste..."
    )

    db.collection("tasks").add(taskTestDoc)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Button(onClick = {
//        addNewTestTask()
        createTestAccount()
    },
        Modifier.padding(100.dp)) {
        Text("Teste do Firestore")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperTasksTheme {
        Greeting("Android")
    }
}