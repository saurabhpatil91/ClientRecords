package com.saurabh.clientrecords.ui.records

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saurabh.clientrecords.data.Record
import com.saurabh.clientrecords.data.RecordRepository

class RecordViewModel(private val recordRepository: RecordRepository) : ViewModel() {


    val etNameContent = MutableLiveData<String>()
    val etEmailContent = MutableLiveData<String>()

    fun addNewRecordClicked() {
        val record = Record(etNameContent.value.toString(), etEmailContent.value.toString())
        recordRepository.addRecord(record)
        etNameContent.value = ""
        etEmailContent.value = ""

    }

    val records: LiveData<List<Record>>
        get() = recordRepository.fetchRecord()


}