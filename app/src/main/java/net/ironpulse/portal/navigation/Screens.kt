package net.ironpulse.portal.navigation

sealed class Screens(val route: String) {
    object Home: Screens("home")
    object Settings: Screens("settings")
    object Activity: Screens("home/activity")
}
