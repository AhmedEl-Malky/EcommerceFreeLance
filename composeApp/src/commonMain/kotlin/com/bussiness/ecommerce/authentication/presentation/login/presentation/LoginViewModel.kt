package com.bussiness.ecommerce.authentication.presentation.login.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class LoginViewModel : ViewModel() {

    private var hasLoadedInitialData = false

    private val _state = MutableStateFlow(LoginState())
    val state = _state.asStateFlow()

    fun onAction(action: LoginAction) {
        when (action) {
            is LoginAction.OnEmailChange -> onEmailChange(action.email)
            is LoginAction.OnPasswordChange -> onPasswordChange(action.password)
            is LoginAction.OnRememberMeCheckToggle -> onRememberMeCheckChange()
            LoginAction.OnLogin -> {}
            LoginAction.OnPasswordVisibilityToggle -> onPasswordVisibilityChange()
        }
    }

    private fun onPasswordVisibilityChange() {
        _state.update {
            it.copy(
                isPasswordVisible = !it.isPasswordVisible
            )
        }
    }

    private fun onEmailChange(email: String) {
        _state.update {
            it.copy(
                email = email
            )
        }
    }

    private fun onPasswordChange(password: String) {
        _state.update {
            it.copy(
                password = password
            )
        }
    }

    private fun onRememberMeCheckChange() {
        _state.update {
            it.copy(
                rememberMe = !it.rememberMe
            )
        }
    }

}