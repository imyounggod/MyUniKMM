package com.melonytech.myuni

import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState
import com.rickclephas.kmp.observableviewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow


class ListViewModel() : ViewModel() {
    @NativeCoroutinesState
    val objects: StateFlow<List<Int>> = MutableStateFlow(listOf(1,2,3))
}
