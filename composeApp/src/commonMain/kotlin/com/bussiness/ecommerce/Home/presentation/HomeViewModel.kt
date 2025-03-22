package com.bussiness.ecommerce.Home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {

    private var hasLoadedInitialData = false

    private val _state = MutableStateFlow(HomeState())
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
            initialValue = HomeState()
        )

    fun onAction(action: HomeAction) {
        when (action) {
            is HomeAction.OnSearchBarVisibilityToggle -> onSearchBarVisibilityToggle(action.isVisible)
            is HomeAction.OnSearchQueryChange -> onSearchQueryChange(action.query)
        }
    }

    private fun onSearchQueryChange(query: String) {
        _state.update {
            it.copy(
                searchQuery = query
            )
        }
    }

    private fun onSearchBarVisibilityToggle(isVisible:Boolean) {
        _state.update {
            it.copy(
                isSearchBarVisible = isVisible
            )
        }
    }

}