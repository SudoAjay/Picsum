package com.sudoajay.picsum.main.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.sudoajay.picsum.R
import com.sudoajay.picsum.databinding.LayoutSettingBottomSheetBinding
import com.sudoajay.picsum.main.MainActivity
import com.sudoajay.picsum.main.proto.ProtoManager
import dagger.Module
import kotlinx.coroutines.launch
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton



class SettingBottomSheet @Inject constructor
   (var mainActivity: MainActivity) : BottomSheetDialogFragment() {

    lateinit var protoManager: ProtoManager
    private var  TAG:String = "SettingBottomSheetTag"


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val myDrawerView = layoutInflater.inflate(R.layout.layout_setting_bottom_sheet, container, false)
        val binding = LayoutSettingBottomSheetBinding.inflate(
            layoutInflater,
            myDrawerView as ViewGroup,
            false
        )


        binding.bottomSheet = this
        binding.activity = mainActivity
        binding.lifecycleOwner = this
        protoManager = mainActivity.protoManager

        return binding.root
    }


    fun setJsonValue(json: String) {
        lifecycleScope.launch {
            protoManager.setJsonConverter(json)
        }
        dismiss()
    }

    fun setDataBaseValue(database: String) {
        lifecycleScope.launch {
            protoManager.setDataBase(database)
        }
        dismiss()
    }
    fun setImageLoader(imageLoader: String) {
        lifecycleScope.launch {
            protoManager.setImageLoader(imageLoader)
        }
        dismiss()
    }


}