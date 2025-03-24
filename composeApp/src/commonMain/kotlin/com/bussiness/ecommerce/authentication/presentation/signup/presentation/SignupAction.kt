package com.bussiness.ecommerce.authentication.presentation.signup.presentation

sealed interface SignupAction {
    data class OnUserNameChange(val userName:String) : SignupAction
    data class OnEmailChange(val email:String) : SignupAction
    data class OnPasswordChange(val password:String) : SignupAction
    data class OnConfirmPasswordChange(val confirmPassword:String) : SignupAction
    data object OnPasswordVisibilityToggle : SignupAction
    data object OnConfirmPasswordVisibilityToggle : SignupAction
}