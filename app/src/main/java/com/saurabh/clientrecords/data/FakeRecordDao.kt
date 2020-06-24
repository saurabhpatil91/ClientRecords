package com.saurabh.clientrecords.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeRecordDao {
    private val recordList = mutableListOf<Record>()
    private val records = MutableLiveData<List<Record>>()

    init {
        records.value = recordList
    }

    fun addRecord(record: Record) {
        recordList.add(record)
        records.value = recordList
    }

    fun fetchRecords() = records as LiveData<List<Record>>
}