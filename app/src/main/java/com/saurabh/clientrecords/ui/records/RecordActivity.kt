package com.saurabh.clientrecords.ui.records

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saurabh.clientrecords.R
import com.saurabh.clientrecords.databinding.ActivityMainBinding
import org.koin.android.viewmodel.ext.android.viewModel

class RecordActivity : AppCompatActivity() {

    //lazy inject viewModel using koin
    private val viewModel: RecordViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeUI()
    }

    private fun initializeUI() {

        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {

            this.lifecycleOwner = this@RecordActivity
            this.recordViewModel = viewModel
        }
    }
}