package com.example.proyectowidgets

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.text.Text

class SimpleWidgetContent : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            MetalOpsWidget()
        }
    }

    @Composable
    private fun MetalOpsWidget() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .padding(12.dp),
            verticalAlignment = Alignment.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Título
            Text(text = "MetalOps – Órdenes de Trabajo")

            Spacer(GlanceModifier.height(8.dp))

            // Resumen muy simple (texto plano)
            Text(text = "OT más reciente: #MO-1043")
            Text(text = "Estado: En progreso · Prioridad: Alta")

            Spacer(GlanceModifier.height(8.dp))

            Text(text = "Hoy: Abiertas: 5 · En progreso: 2 · Cerradas: 3")

            Spacer(GlanceModifier.height(12.dp))

            // Botones para abrir vistas
            Row(horizontalAlignment = Alignment.CenterHorizontally) {
                Button(
                    text = "Ver OTs",
                    onClick = actionStartActivity<MainActivity>()
                )
                Button(
                    text = "Nueva OT",
                    onClick = actionStartActivity<SecondActivity>()
                )
            }

            Spacer(GlanceModifier.height(6.dp))

            Row(horizontalAlignment = Alignment.CenterHorizontally) {
                Button(
                    text = "Historial",
                    onClick = actionStartActivity<HistoryActivity>()
                )
            }
        }
    }
}
