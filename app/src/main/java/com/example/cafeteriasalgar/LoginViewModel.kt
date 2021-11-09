package com.example.cafeteriasalgar

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel(){

    init {
        Log.i("LoginViewModel", "LoginViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("HomeViewModel", "HomeViewModel destroyed!")
    }

}

