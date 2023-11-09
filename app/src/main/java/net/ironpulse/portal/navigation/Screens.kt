package net.ironpulse.portal.navigation

sealed class Screens(val route: String) {
    object Home: Screens("home_route")
    object Settings: Screens("settings_route")
}
