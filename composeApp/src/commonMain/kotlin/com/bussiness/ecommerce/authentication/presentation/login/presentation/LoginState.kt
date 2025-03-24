package com.bussiness.ecommerce.authentication.presentation.login.presentation

data class LoginState(
    val email:String = "",
    val password:String = "",
    val rememberMe:Boolean = false,
    val isPasswordVisible:Boolean = false
)