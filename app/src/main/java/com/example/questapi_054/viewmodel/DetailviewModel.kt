package com.example.questapi_054.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.questapi_054.modeldata.DataSiswa
import com.example.questapi_054.repositori.RepositoriDataSiswa

sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriDataSiswa: RepositoriDataSiswa
) : ViewModel()