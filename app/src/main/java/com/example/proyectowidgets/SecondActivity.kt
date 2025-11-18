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

class SecondActivity : ComponentActivity() {
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
                            text = "MetalOps – Nueva Orden de Trabajo",
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(
                            text = "Datos que normalmente se registrarían:",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(text = "• Equipo: Prensa 3")
                        Text(text = "• Tipo: Correctivo")
                        Text(text = "• Prioridad: Alta")
                        Text(text = "• Descripción: Fuga de aceite en cilindro hidráulico.")
                        Text(text = "• Responsable: Técnico mecánico de turno.")
                        Text(text = "• Fecha objetivo de cierre: 18/11/2025")

                        Text(
                            text = "\nEn la versión real de MetalOps aquí iría el formulario\npara crear la OT desde la app.",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
        }
    }
}
