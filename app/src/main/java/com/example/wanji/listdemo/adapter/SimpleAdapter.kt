package com.example.wanji.listdemo.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 *   by  :   syz
 *   Time: 2018/11/21 9:55
 *   Description:
 */
abstract class SimpleAdapter<T, B : ViewDataBinding>(var context: Context) : RecyclerView.Adapter<SimpleAdapter.Holder>() {
    var items: MutableList<T>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder =
            Holder(DataBindingUtil.inflate<B>(LayoutInflater.from(context), this.getLayoutResId(viewType), parent, false))


    override fun getItemCount(): Int = items?.size ?: 0

    override fun onBindViewHolder(holder: Holder, position: Int) =
            onBindItem(holder.binding as B, items?.get(position))


    @LayoutRes
    protected abstract fun getLayoutResId(viewType: Int): Int

    protected abstract fun onBindItem(binding: B?, item: T?)

    class Holder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)
}