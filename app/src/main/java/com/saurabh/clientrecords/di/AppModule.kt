package com.saurabh.clientrecords.di

import com.saurabh.clientrecords.data.FakeDatabase
import com.saurabh.clientrecords.data.RecordRepository
import com.saurabh.clientrecords.ui.records.RecordViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

@JvmField
val appModule = module {

    single<RecordRepository> {
        RecordRepository.getInstance(FakeDatabase.getInstance().recordDao)
    }

    viewModel { RecordViewModel(get()) }

}