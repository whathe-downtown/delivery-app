package com.example.delivery_app.widget.adapter.viewholder

import com.example.delivery_app.databinding.ViewholderEmptyBinding
import com.example.delivery_app.model.Model
import com.example.delivery_app.screen.base.BaseViewModel
import com.example.delivery_app.util.provider.ResourcesProvider

import com.example.delivery_app.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
    viewModel : BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<Model>(binding,viewModel, resourcesProvider) {
    override fun reset()= Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener)  = Unit
}