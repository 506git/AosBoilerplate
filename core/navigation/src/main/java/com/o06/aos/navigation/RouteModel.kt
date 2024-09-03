package com.o06.aos.navigation

import kotlinx.serialization.Serializable

//sealed interface Route {
//    @Serializable
//    data object Contributor : Route
//
//    @Serializable
//    data object Session : Route
//
//    @Serializable
//    data class SessionDetail(val sessionId: String) : Route
//}

sealed interface MainTabRoute{
    @Serializable
    data object Home : MainTabRoute
//
//    @Serializable
//    data object Setting : MainTabRoute
//
//    @Serializable
//    data object Bookmark : MainTabRoute
}
