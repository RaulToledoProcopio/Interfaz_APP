package com.example.interfaz_din.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var loginError by mutableStateOf(false)
        private set

    fun validateLogin(email: String, password: String): Boolean {
        val isValid = email == "raul@gmail.com" && password == "12345"
        loginError = !isValid
        return isValid
    }
}
