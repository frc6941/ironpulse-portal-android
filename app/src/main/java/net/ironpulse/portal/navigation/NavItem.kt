package net.ironpulse.portal.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String = "",
    val icon : ImageVector = Icons.Filled.Home,
    val route : String = ""
) {
    fun bottomNavigationItems() : List<NavItem> {
        return listOf(
            NavItem(
                label = "Home",
                icon = Icons.Filled.Home,
                route = Screens.Home.route
            ),
            NavItem(
                label = "Settings",
                icon = Icons.Filled.Settings,
                route = Screens.Settings.route
            ),
        )
    }
}
