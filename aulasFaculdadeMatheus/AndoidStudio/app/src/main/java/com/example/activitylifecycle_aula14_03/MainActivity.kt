// O arquivo MainActivity.kt está dentro desse pacote:
package com.example.activitylifecycle_aula14_03

// Seção de importação de recursos que serão usados aqui.
// Recursos = Classes, Interfaces, Classes Abstratas, constantes,
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activitylifecycle_aula14_03.ui.theme.ActivityLifecycleaula14_03Theme

/**
 *  Toda tela no Android é uma Activity.
 *  Então, cada tela no App pode ser uma Activity.
 *  Quando o usuario está no App, ele está vizualizando
 *  uma instancia de Activity por vez
 */
class MainActivity : ComponentActivity() {

    val TAG = "MainActivity"
    var estado = ""


//    fun calcularPerimetroQuadrado(l: Int): Int =  l * 4

    // Metodo reimplementado da classe Activity que é superClasse da classe ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActivityLifecycleaula14_03Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        estado = "Activity: CRIADA"
        Log.i(TAG, estado) //
    }

    override fun onStart() {
        super.onStart()
        estado = "Activity: INICIADA"
        Log.i(TAG, estado)
    }

    override fun onResume() {
        super.onResume()
        estado = "Activity: EM EXIBIÇÃO"
        Log.i(TAG, estado)
    }

    override fun onRestart() {
        super.onRestart()
        estado = "Activity: REINICIADA"
        Log.i(TAG, estado)
    }

    override fun onPause() {
        super.onPause()
        estado = "Activity: PAUSADA"
        Log.i(TAG, estado)
    }

    override fun onStop() {
        super.onStop()
        estado = "Activity: PARADA"
        Log.i(TAG, estado)
    }

    override fun onDestroy() {
        super.onDestroy()
        estado = "Activity: ENCERRADA"
        Log.i(TAG, estado)
    }

    // exercicio adroid activity lifecycle trazer resumo
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActivityLifecycleaula14_03Theme {
        Greeting("Android")
    }
}