package com.bussiness.ecommerce.authentication.presentation.login.presentation

sealed interface LoginAction {
    data class OnEmailChange(val email: String) : LoginAction
    data class OnPasswordChange(val password:String) : LoginAction
    data object OnRememberMeCheckToggle : LoginAction
    data object OnLogin : LoginAction
    data object OnPasswordVisibilityToggle : LoginAction
}