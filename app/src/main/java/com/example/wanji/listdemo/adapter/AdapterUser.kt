package com.example.wanji.listdemo.adapter

import android.content.Context
import android.util.Log
import android.view.View
import com.example.wanji.listdemo.R
import com.example.wanji.listdemo.bean.UserBean
import com.example.wanji.listdemo.databinding.ItemUserBinding

/**
 *   by  :   syz
 *   Time: 2018/11/20 13:51
 *   Description:
 */
class AdapterUser(context: Context) : SimpleAdapter<UserBean, ItemUserBinding>(context) {
    override fun getLayoutResId(viewType: Int): Int = R.layout.item_user

    override fun onBindItem(binding: ItemUserBinding?, item: UserBean?) {
        binding?.user = item
        binding?.handler = AdapterUserHandler()
        binding?.executePendingBindings()
    }

    inner class AdapterUserHandler {
        fun clickItem(view: View) {
            Log.e("syz", "user.toString()")
        }

        fun clickWithParam(user: UserBean) {
            Log.e("syz", user.toString())
        }
    }
}