package com.saurabh.clientrecords.data

class RecordRepository private constructor(private val recordDao: FakeRecordDao) {

    fun addRecord(record: Record){
        recordDao.addRecord(record)
    }

    fun fetchRecord() = recordDao.fetchRecords()

    companion object {
        @Volatile
        private var instance: RecordRepository? = null
        fun getInstance(quoteDao: FakeRecordDao) =
            instance ?: synchronized(this) {
                instance ?: RecordRepository(quoteDao).also { instance = it }
            }
    }
}