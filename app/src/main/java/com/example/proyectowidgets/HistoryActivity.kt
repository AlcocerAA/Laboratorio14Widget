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

class HistoryActivity : ComponentActivity() {
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
                            text = "MetalOps – Historial de Órdenes de Trabajo",
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(
                            text = "Últimas OTs cerradas:",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(text = "• #MO-1038 – Cambio de rodamiento – Molino 1 – Cerrada el 15/11/2025")
                        Text(text = "• #MO-1035 – Ajuste de banda – Transportador 2 – Cerrada el 14/11/2025")
                        Text(text = "• #MO-1032 – Limpieza de filtros – Línea B – Cerrada el 13/11/2025")

                        Text(
                            text = "\nEn una implementación real, aquí se listaría\nel historial desde la base de datos de MetalOps.",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
        }
    }
}