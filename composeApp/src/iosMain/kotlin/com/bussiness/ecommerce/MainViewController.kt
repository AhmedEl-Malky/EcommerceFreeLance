package com.bussiness.ecommerce

import androidx.compose.ui.window.ComposeUIViewController
import com.bussiness.ecommerce.app.App
import com.bussiness.ecommerce.app.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initKoin() }
) { App() }