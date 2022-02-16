package com.example.delivery_app.widget.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import
import com.example.delivery_app.model.Model
import com.example.delivery_app.screen.base.BaseViewModel
import com.example.delivery_app.util.provider.ResourcesProvider
import com.example.delivery_app.widget.adapter.listener.AdapterListener
import com.example.delivery_app.widget.adapter.viewholder.ModelViewHolder

class ModelRecyclerAdapter<M : Model, VM : BaseViewModel>(
    private var modelList: List<Model>,
    private val viewModel: VM,
    private val resourcesProvider: ResourcesProvider,
    private val adapterListener: AdapterListener
): ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {

    override fun getItemCount(): Int = modelList.size

    override fun getItemViewType(position: Int): Int =modelList[position].type.ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder<M> {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ModelViewHolder<M>, position: Int) {
        TODO("Not yet implemented")
    }

}