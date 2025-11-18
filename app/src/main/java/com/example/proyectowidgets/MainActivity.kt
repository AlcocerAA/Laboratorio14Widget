package com.example.proyectowidgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.proyectowidgets.ui.theme.ProyectoWidgetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoWidgetsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "MetalOps – Panel de Órdenes de Trabajo",
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(
                            text = "Resumen general:",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(text = "• OTs abiertas: 5")
                        Text(text = "• OTs en progreso: 2")
                        Text(text = "• OTs cerradas hoy: 3")

                        Text(
                            text = "\nÓrdenes activas:",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(text = "• #MO-1043 – Mant. preventivo – Línea A – En progreso")
                        Text(text = "• #MO-1042 – Fuga de aceite – Prensa 3 – Abierta")
                        Text(text = "• #MO-1040 – Vibración anormal – Molino 2 – En progreso")
                    }
                }
            }
        }
    }
}
