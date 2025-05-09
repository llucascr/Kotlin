package com.experimento.vizualizacoespersonalizadas

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.center
import androidx.compose.ui.unit.dp
import com.experimento.vizualizacoespersonalizadas.ui.theme.VizualizacoesPersonalizadasTheme
import java.text.DecimalFormat
import kotlin.math.abs
import kotlin.math.atan2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VizualizacoesPersonalizadasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    VolumeKnob(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

private fun Float.toRad(): Float {
    return this * (Math.PI / 180f).toFloat()
}

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun VolumeKnob(
    modifier: Modifier,
    numberOfCircles: Int = 40,
    minSize: Dp = 64.dp,
    onVolumeChanged: (Float) -> Unit = {}
    ) {

    var angle by remember { mutableStateOf(0f) }
    var dragStartedAngle by remember { mutableStateOf(0f) }
    var oldAngle by remember { mutableStateOf(angle) }
    var volume by remember { mutableStateOf(0f) }

    var state by remember {mutableStateOf(false)}
    val colourTransitionDurationMs = 1000

    val volumeFormatter = DecimalFormat("#.#")
    val ringColorOff = Color.LightGray
    val ringColorON = Color.Green
    val dotCircleNormalColor = Color(0xff00ff00)
    val dotCircleEmphasisedColor = Color(0xff9737bf)
    val offsetAngleDegree = 20f

    val ringColor by animateColorAsState(
        targetValue = if (state) ringColorON else ringColorOff,
        animationSpec = tween(
            durationMillis = colourTransitionDurationMs,
        )
    )

    BoxWithConstraints() {

        val width = if (minWidth < 1.dp) minSize else minWidth

        val height = if (minHeight < 1.dp) minSize else minHeight

        Canvas(
            modifier = modifier
                .size(width, height)
                .pointerInput(true) {
                    detectDragGestures(
                        onDragStart = { offset ->
                            dragStartedAngle = atan2(
                                y = size.center.x - offset.x,
                                x = size.center.y - offset.y
                            ) * (180f / Math.PI.toFloat()) * -1
                        },
                        onDragEnd = {
                            oldAngle = angle
                        }
                    ) { change, _ ->

                        val touchAngle = atan2(
                            y = size.center.x - change.position.x,
                            x = size.center.y - change.position.y
                        ) * (180f / Math.PI.toFloat()) * -1

                        angle - oldAngle + (touchAngle - dragStartedAngle)

                        if (angle > 360) {
                            angle -=360
                        } else if (angle < 0) {
                            angle = 360 - abs(angle)
                        }

                        if (angle > 360f - (offsetAngleDegree * .8f))
                            angle = 0f
                        else if (angle > 0f && angle < offsetAngleDegree)
                            angle = offsetAngleDegree

                        state = angle >= offsetAngleDegree && angle <= (360f - offsetAngleDegree / 2)

                        val newVolume = if (angle < offsetAngleDegree)
                            0f
                        else
                            (angle) / (360f - offsetAngleDegree)

                        volume = newVolume.coerceIn(
                            minimumValue = 0f,
                            maximumValue = 1f
                        )

                        onVolumeChanged(newVolume)
                    }
                }
        ) {

            val radius = (size.width * .5f) - (.25f * (size.width * .5f))

            drawCircle(
                color = ringColor,
                style = Stroke(
                    width = (radius * .1f)
                ),
                radius = radius,
                center = size.center
            )

            val lineDegree = (360f - offsetAngleDegree * 2) / numberOfCircles

            for (circleNumber in 0..numberOfCircles) {

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VizualizacoesPersonalizadasTheme {
    }
}