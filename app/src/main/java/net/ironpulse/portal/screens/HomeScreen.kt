package net.ironpulse.portal.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.ironpulse.portal.components.ActivityInfo
import net.ironpulse.portal.ui.theme.IronpulsePortalTheme
import java.time.LocalDate
import java.util.UUID

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "2023",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Card(
            modifier = Modifier
                .width(350.dp),
            colors = cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            )
        ) {
            ActivityInfo(
                modifier = Modifier.padding(16.dp),
                date = LocalDate.now(),
                attendance = 1,
                id = UUID.randomUUID().toString()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    IronpulsePortalTheme {
        HomeScreen()
    }
}