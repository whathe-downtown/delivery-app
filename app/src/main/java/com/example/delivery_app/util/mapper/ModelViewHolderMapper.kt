package com.example.delivery_app.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import com.example.delivery_app.databinding.ViewholderEmptyBinding
import com.example.delivery_app.model.CellType
import com.example.delivery_app.model.Model
import com.example.delivery_app.screen.base.BaseViewModel
import com.example.delivery_app.util.provider.ResourcesProvider
import com.example.delivery_app.widget.adapter.viewholder.EmptyViewHolder
import com.example.delivery_app.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {
    @Suppress("UNCHECKED_CAST")
    fun <M: Model> map(
        parent: ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourcesProvider: ResourcesProvider
    ): ModelViewHolder<M>{
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when(type){
            CellType.EMPTY_CELL -> EmptyViewHolder(
                ViewholderEmptyBinding.inflate(inflater,parent, false),
                viewModel,
                resourcesProvider
            )
        }
        return  viewHolder as ModelViewHolder<M>
    }
}