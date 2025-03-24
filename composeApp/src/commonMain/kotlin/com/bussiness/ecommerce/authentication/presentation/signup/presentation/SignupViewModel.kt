package com.bussiness.ecommerce.authentication.presentation.signup.presentation

import androidx.lifecycle.ViewModel
import com.bussiness.ecommerce.Core.domain.onError
import com.bussiness.ecommerce.Core.domain.onSuccess
import com.bussiness.ecommerce.authentication.domain.UserDataValidator
import com.bussiness.ecommerce.authentication.presentation.components.toUiText
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SignupViewModel(
    val userValidator: UserDataValidator
) : ViewModel() {

    private var hasLoadedInitialData = false

    private val _state = MutableStateFlow(SignupState())
    val state = _state.asStateFlow()

    fun onAction(action: SignupAction) {
        when (action) {
            is SignupAction.OnUserNameChange -> onUserNameChange(action.userName)
            is SignupAction.OnEmailChange -> onEmailChange(action.email)
            is SignupAction.OnPasswordChange -> onPasswordChange(action.password)
            is SignupAction.OnConfirmPasswordChange -> onConfirmPasswordChange(action.confirmPassword)
            SignupAction.OnPasswordVisibilityToggle -> onPasswordVisibilityToggle()
            SignupAction.OnConfirmPasswordVisibilityToggle -> onConfirmPasswordVisibilityToggle()
        }
    }

    private fun onUserNameChange(userName: String) {
        _state.update {
            it.copy(
                userName = userName
            )
        }
        userValidator.onUserNameValidate(userName).onSuccess {
            _state.update {
                it.copy(
                    userNameError = null
                )
            }
        }.onError { error ->
            _state.update {
                it.copy(
                    userNameError = error.toUiText()
                )
            }
        }

    }

    private fun onEmailChange(email: String) {
        _state.update {
            it.copy(
                email = email
            )
        }

        userValidator.onEmailValidate(email).onSuccess {
            _state.update {
                it.copy(
                    emailError = null
                )
            }
        }.onError { error ->
            _state.update {
                it.copy(
                    emailError = error.toUiText()
                )
            }
        }
    }

    private fun onPasswordChange(password: String) {
        _state.update {
            it.copy(
                password = password
            )
        }
        userValidator.onPasswordValidate(password).onSuccess {
            _state.update {
                it.copy(
                    passwordError = null
                )
            }
        }.onError { error ->
            _state.update {
                it.copy(
                    passwordError = error.toUiText()
                )
            }
        }
    }

    private fun onConfirmPasswordChange(confirmPassword: String) {
        _state.update {
            it.copy(
                confirmPassword = confirmPassword
            )
        }
        userValidator.onConfirmPasswordValidate(password = _state.value.password, confirmPassword)
            .onSuccess {
                _state.update {
                    it.copy(
                        confirmPasswordError = null
                    )
                }
            }.onError { error ->
            _state.update {
                it.copy(
                    confirmPasswordError = error.toUiText()
                )
            }
        }
    }

    private fun onPasswordVisibilityToggle() {
        _state.update {
            it.copy(
                isPasswordVisible = !it.isPasswordVisible
            )
        }
    }

    private fun onConfirmPasswordVisibilityToggle() {
        _state.update {
            it.copy(
                isConfirmPasswordVisible = !it.isConfirmPasswordVisible
            )
        }
    }

}