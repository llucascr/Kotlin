package com.experimento.tirarfoto.permissions

import android.content.pm.PackageManager
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun RequestPermissionScreen(
    modifier: Modifier = Modifier,
    permission: String,
    buttonTextPermission: String,
    onPermissionGranted: () -> Unit
) {
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { granted ->
        if(granted) {
            onPermissionGranted()
        }
    }

    Box(modifier = modifier.fillMaxSize()) {
        Button(
            modifier = modifier.align(Alignment.Center),
            onClick = { launcher.launch(permission) }
        ) {
            Text(buttonTextPermission)
        }
    }
}

@Composable
fun WithPermissions(
    modifier: Modifier = Modifier,
    permission: String,
    buttonTextPermission: String,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    var permissionGranted by remember {
        mutableStateOf(context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED)
    }

    if (!permissionGranted) {
        // vamos carregar a outra composable para pedir permissao
        RequestPermissionScreen(
            modifier = modifier,
            permission = permission,
            buttonTextPermission = buttonTextPermission
        ) {
            permissionGranted = true
        }
    } else {
        Surface(modifier = modifier) {
            content()
        }
    }
}