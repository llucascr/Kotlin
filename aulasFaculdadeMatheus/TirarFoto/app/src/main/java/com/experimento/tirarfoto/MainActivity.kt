package com.experimento.tirarfoto

import android.Manifest
import android.os.Bundle
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
import com.experimento.tirarfoto.permissions.WithPermissions
import com.experimento.tirarfoto.ui.theme.TirarFotoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TirarFotoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WithPermissions(
                        modifier = Modifier.padding(innerPadding),
                        permission = Manifest.permission.CAMERA,
                        buttonTextPermission = "Conceder acesso à Camera",
                    ) {
                        TakepictureScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun TakepictureScreen() {
    Text("Tela com a camera aberta pronta para tirar foto")
}

@Composable
@Preview
fun TakePictureScreenPreview() {
    TakepictureScreen()
}
