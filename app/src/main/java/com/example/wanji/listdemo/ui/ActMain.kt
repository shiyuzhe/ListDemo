package com.example.wanji.listdemo.ui

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.wanji.listdemo.R
import com.example.wanji.listdemo.bean.UserBean
import com.example.wanji.listdemo.databinding.ActMainBinding

class ActMain : AppCompatActivity() {

    private var binding: ActMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActMainBinding>(this, R.layout.act_main)
        binding?.handler = MainHandler()
    }


    inner class MainHandler {
        fun getData(view: View) {
            Log.e("syz", "getData")
            binding?.user = UserBean("id", "name", "age")
        }

        fun nextData(view: View) {
            Log.e("syz", "nextData")
            startActivity(Intent(this@ActMain, ActLv::class.java))
        }

        fun prevData(user: UserBean?) {
            Log.e("syz", "prevData$user")
        }

    }

}
