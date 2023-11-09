package net.ironpulse.portal.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import net.ironpulse.portal.R
import net.ironpulse.portal.ui.theme.IronpulsePortalTheme
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.UUID

@Composable
fun ActivityInfo(modifier: Modifier = Modifier, date: LocalDate, attendance: Int, id: String) {
    Column(modifier = modifier) {
        Text(
            text = "${date.format(DateTimeFormatter.ISO_DATE)} ${stringResource(id = R.string.activity)}",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = id,
            color = MaterialTheme.colorScheme.secondary,
            fontStyle = FontStyle.Italic,
            fontSize = 15.sp
        )
        Text(
            text = "${stringResource(id = R.string.attendance)}: $attendance",
            color = MaterialTheme.colorScheme.secondary,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ActivityInfoPreview() {
    IronpulsePortalTheme {
        ActivityInfo(date = LocalDate.now(), attendance = 45, id = UUID.randomUUID().toString())
    }
}