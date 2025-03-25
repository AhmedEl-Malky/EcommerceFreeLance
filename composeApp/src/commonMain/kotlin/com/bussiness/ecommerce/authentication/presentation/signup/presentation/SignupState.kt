package com.bussiness.ecommerce.authentication.presentation.signup.presentation

import com.bussiness.ecommerce.Core.domain.UiText

data class SignupState(
    val userName: String = "",
    val email: String = "",
    val password: String = "",
    val confirmPassword: String = "",
    val isPasswordVisible: Boolean = false,
    val isConfirmPasswordVisible: Boolean = false,
    val userNameError: UiText? = null,
    val emailError: UiText? = null,
    val passwordError: UiText? = null,
    val confirmPasswordError: UiText? = null,
    val isRegisterValid:Boolean = false
)