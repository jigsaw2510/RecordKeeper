package com.example.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recordkeeper.databinding.ActivityEditCyclingRecordBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCyclingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra("Name")
        title = "$name Record"
    }
}