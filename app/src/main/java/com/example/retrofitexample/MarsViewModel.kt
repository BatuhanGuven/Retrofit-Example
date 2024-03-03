package com.example.retrofitexample

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import okio.IOException

class MarsViewModel : ViewModel() {
    var marsUiState: MarsUiState by mutableStateOf(MarsUiState.Loading)
        private set





    sealed interface MarsUiState {
        data class Success(val photos: List<PhotoData>) : MarsUiState
        object Error : MarsUiState
        object Loading : MarsUiState
    }

    init {
        getMarsPhotos()
    }

    fun getMarsPhotos() {
        viewModelScope.launch {
            try {
                val photoList = MarsApi.retrofitService.getPhotos()
                marsUiState = MarsUiState.Success(photoList)
            } catch (e: IOException) {
                marsUiState = MarsUiState.Error
            }
        }
    }
}