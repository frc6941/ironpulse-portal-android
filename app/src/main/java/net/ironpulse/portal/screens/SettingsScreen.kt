package net.ironpulse.portal.screens

import androidx.annotation.OptIn
import androidx.camera.core.ExperimentalGetImage
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import net.ironpulse.portal.components.Camera
import net.ironpulse.portal.ui.theme.IronpulsePortalTheme

@OptIn(ExperimentalGetImage::class)
@Composable
fun SettingsScreen() {
    QRCodeScanningScreen()
}

@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    IronpulsePortalTheme {
        SettingsPreview()
    }
}