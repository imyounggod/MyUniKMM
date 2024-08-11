package com.melonytech.myuni

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform