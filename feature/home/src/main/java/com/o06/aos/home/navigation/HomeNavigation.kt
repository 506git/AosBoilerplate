package com.o06.aos.home.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.o06.aos.home.HomeRoute
import com.o06.aos.navigation.MainTabRoute

fun NavController.navigateHome(navOptions: NavOptions) {
    navigate(MainTabRoute.Home, navOptions)
}

fun NavGraphBuilder.homeNavGraph(
    padding: PaddingValues,
    onSessionClick: () -> Unit,
    onContributorClick: () -> Unit,
    onShowErrorSnackBar: (throwable: Throwable?) -> Unit,
) {
    composable<MainTabRoute.Home> {
        HomeRoute(padding, onSessionClick, onContributorClick, onShowErrorSnackBar)
    }
}
