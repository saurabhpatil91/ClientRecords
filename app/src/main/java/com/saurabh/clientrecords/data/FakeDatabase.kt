package com.saurabh.clientrecords.data

class FakeDatabase private constructor() {

    var recordDao = FakeRecordDao()
    companion object {
        @Volatile private var instance : FakeDatabase? = null

        fun getInstance() = instance ?: synchronized(this){
            instance ?: FakeDatabase().also { instance = it }
        }
    }
}