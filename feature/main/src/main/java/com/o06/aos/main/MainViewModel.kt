package com.o06.aos.main


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
) : ViewModel() {

//    val isDarkTheme = settingsRepository.flowIsDarkTheme()
//
//    fun updateIsDarkTheme(isDarkTheme: Boolean) =
//        viewModelScope.launch {
//            settingsRepository.updateIsDarkTheme(isDarkTheme)
//        }
}
