package com.example.tigerclone.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val userId = MutableLiveData<String>("test@lavie")
    val password = MutableLiveData<String>("test")
    val fieldId = MutableLiveData<String>("AKG003")
    val isTest = MutableLiveData<Boolean>(true)

    fun login() {
        Log.d("Login", "userId: ${userId.value}, password: ${password.value}, fieldId: ${fieldId.value}, isTest: ${isTest.value}")
    }

    // TODO: AppData에 UserId, FieldId, IsTest 값 저장
    // TODO: StaticValue에 넣을 값 구별
    // TODO: Login 구현
    // TODO: API repository 연결
}