package com.bussiness.ecommerce.app.di

import com.bussiness.ecommerce.Home.presentation.HomeViewModel
import com.bussiness.ecommerce.authentication.domain.UserDataValidator
import com.bussiness.ecommerce.authentication.presentation.login.presentation.LoginViewModel
import com.bussiness.ecommerce.authentication.presentation.signup.presentation.SignupViewModel
import com.bussiness.ecommerce.category.presentation.CategoryViewModel
import com.bussiness.ecommerce.product.presentation.ProductViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

expect val platformModule:Module


val sharedModule:Module = module {
    singleOf(::LoginViewModel)
    singleOf(::SignupViewModel)
    singleOf(::HomeViewModel)
    singleOf(::CategoryViewModel)
    singleOf(::ProductViewModel)

    singleOf(::UserDataValidator)
}