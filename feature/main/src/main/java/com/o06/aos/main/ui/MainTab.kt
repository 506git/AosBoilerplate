package com.o06.aos.main.ui

import androidx.compose.runtime.Composable
import com.o06.aos.feature.main.R
import com.o06.aos.navigation.MainTabRoute

internal enum class MainTab(
    val iconResId: Int,
    internal val contentDescription: String,
    val route: MainTabRoute,
) {
//    SETTING(
//        iconResId = R.drawable.ic_setting,
//        contentDescription = "설정",
//        MainTabRoute.Setting,
//    ),
    HOME(
        iconResId = R.drawable.ic_home,
        contentDescription = "홈",
        MainTabRoute.Home
    );
//    BOOKMARK(
//        iconResId = R.drawable.ic_bookmark,
//        contentDescription = "북마크",
//        MainTabRoute.Bookmark,
//    );

    companion object {
        @Composable
        fun find(predicate: @Composable (MainTabRoute) -> Boolean): MainTab? {
            return entries.find { predicate(it.route) }
        }

        @Composable
        fun contains(predicate: @Composable (MainTabRoute) -> Boolean): Boolean {
            return entries.map { it.route }.any { predicate(it) }
        }
    }
}
