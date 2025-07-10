package com.rodriguez.juan.laboratoriocalificado04_rodriguezordoezjuan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rodriguez.juan.laboratoriocalificado04_rodriguezordoezjuan.databinding.ActivityGalleryBinding
import java.io.File

class GalleryActivity: AppCompatActivity() {
    private lateinit var binding: ActivityGalleryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val directory = File(externalMediaDirs[0].absolutePath)
        val files = directory.listFiles() as Array<File>

        val adapter = GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter = adapter
    }
}