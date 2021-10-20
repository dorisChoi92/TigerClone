package com.example.tigerclone.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _userId = MutableLiveData<String>("test@lavie")
    private val _password = MutableLiveData<String>("test")
    private val _fieldId= MutableLiveData<String>("AKG003")
    private val _isTest = MutableLiveData<Boolean>(true)

    var userId: LiveData<String> = _userId
    var password: LiveData<String> = _password
    var fieldId: LiveData<String> = _fieldId
    var isTest: LiveData<Boolean> = _isTest
}