package com.example.questapi_054.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.questapi_054.modeldata.UIStateSiswa
import com.example.questapi_054.repositori.RepositoriDataSiswa
import com.example.questapi_054.uicontroller.route.DestinasiDetail

class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriDataSiswa: RepositoriDataSiswa
) : ViewModel(){
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetail.itemIdArg])
}