package com.bussiness.ecommerce

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform