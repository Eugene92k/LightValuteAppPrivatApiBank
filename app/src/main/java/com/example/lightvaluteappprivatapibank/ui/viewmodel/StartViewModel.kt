package com.example.lightvaluteappprivatapibank.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lightvaluteappprivatapibank.api.model.nal.Nalichka
import com.example.lightvaluteappprivatapibank.data.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {
    var _repository = Repository()
    val _moneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney() {
        viewModelScope.launch {
            _moneyList.value = _repository.getNal()
        }
    }
}