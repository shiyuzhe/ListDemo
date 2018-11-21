package com.example.wanji.listdemo.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.wanji.listdemo.R
import com.example.wanji.listdemo.adapter.AdapterUser
import com.example.wanji.listdemo.bean.UserBean
import kotlinx.android.synthetic.main.act_lv.*

class ActLv : AppCompatActivity() {

    private val adapter by lazy {
        AdapterUser(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_lv)
        actLv_rv.layoutManager = LinearLayoutManager(this)
        actLv_rv.adapter = adapter
        initData(30)
    }

    private fun initData(num: Int) {
        val users = mutableListOf<UserBean>()
        for (i in 0..num) {
            val user = UserBean("UserId$i", "UserName$i", "UserAge$i")
            users.add(user)
        }
        adapter.items = users
        adapter.notifyDataSetChanged()
    }
}
