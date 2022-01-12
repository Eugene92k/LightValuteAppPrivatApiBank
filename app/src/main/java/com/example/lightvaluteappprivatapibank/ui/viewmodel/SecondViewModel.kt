package com.example.lightvaluteappprivatapibank.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lightvaluteappprivatapibank.api.model.beznal.Beznal
import com.example.lightvaluteappprivatapibank.data.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {

    var _repository = Repository()
    var _moneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney() {
        viewModelScope.launch {
            _moneyList.value = _repository.getBeznal()
        }
    }
}