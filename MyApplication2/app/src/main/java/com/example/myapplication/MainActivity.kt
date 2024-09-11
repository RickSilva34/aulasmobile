package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColumnWithTitleAndObservations()
                }
            }
        }
    }
}

@Composable
fun ColumnWithTitleAndObservations() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TitleAndObservation(
            title = "Título 1",
            observation = "Observação para o título 1."
        )
        Spacer(modifier = Modifier.height(16.dp))
        TitleAndObservation(
            title = "Título 2",
            observation = "Observação para o título 2."
        )
        Spacer(modifier = Modifier.height(16.dp))
        TitleAndObservation(
            title = "Título 3",
            observation = "Observação para o título 3."
        )
    }
}

@Composable
fun TitleAndObservation(title: String, observation: String) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = observation,
            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp), // Adiciona algum padding horizontal para o Row
            horizontalArrangement = Arrangement.SpaceBetween // Garante que os botões fiquem alinhados horizontalmente com espaço entre eles
        ) {
            Button(
                onClick = { /* Ação para o botão Editar */ },
                modifier = Modifier.weight(1f) // Garante que os botões ocupem o espaço disponível igualmente
            ) {
                Text("Editar")
            }
            Spacer(modifier = Modifier.width(8.dp)) // Espaço entre os botões
            Button(
                onClick = { /* Ação para o botão Feito */ },
                modifier = Modifier.weight(1f) // Garante que os botões ocupem o espaço disponível igualmente
            ) {
                Text("Feito")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnWithTitleAndObservationsPreview() {
    MyApplicationTheme {
        ColumnWithTitleAndObservations()
    }
}
