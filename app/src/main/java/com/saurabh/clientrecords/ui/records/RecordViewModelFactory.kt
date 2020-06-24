package com.saurabh.clientrecords.ui.records

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saurabh.clientrecords.data.RecordRepository

class RecordViewModelFactory(private val recordRepository: RecordRepository):
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RecordViewModel(recordRepository) as T
    }

}