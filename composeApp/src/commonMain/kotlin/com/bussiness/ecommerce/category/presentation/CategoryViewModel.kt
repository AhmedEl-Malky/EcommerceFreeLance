package com.bussiness.ecommerce.category.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class CategoryViewModel : ViewModel() {

    private var hasLoadedInitialData = false

    private val _state = MutableStateFlow(CategoryState())
    val state = _state
        .onStart {
            if (!hasLoadedInitialData) {
                /** Load initial data here **/
                hasLoadedInitialData = true
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000L),
            initialValue = CategoryState()
        )

    fun onAction(action: CategoryAction) {
        when (action) {
            CategoryAction.OnIsLoadingToggle -> isLoadingToggle()
        }
    }

    private fun isLoadingToggle(){
        _state.update {
            it.copy(
                isLoading = !it.isLoading
            )
        }
    }

}