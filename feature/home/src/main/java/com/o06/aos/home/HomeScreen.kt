package com.o06.aos.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun HomeRoute(
    padding: PaddingValues,
    onSessionClick: () -> Unit,
    onContributorClick: () -> Unit,
    onShowErrorSnackBar: (throwable: Throwable?) -> Unit,
    viewModel: HomeViewModel = hiltViewModel(),
) {

    LaunchedEffect(true) {

    }

    HomeScreen(
        padding = padding,
        onSessionClick = onSessionClick,
        onContributorClick = onContributorClick,
    )
}

@Composable
private fun HomeScreen(
    padding: PaddingValues,
    onSessionClick: () -> Unit,
    onContributorClick: () -> Unit,
) {
    val scrollState = rememberScrollState()
    Column(
        Modifier
            .padding(padding)
            .padding(horizontal = 8.dp)
            .verticalScroll(scrollState)
            .padding(bottom = 4.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {

    }
}

