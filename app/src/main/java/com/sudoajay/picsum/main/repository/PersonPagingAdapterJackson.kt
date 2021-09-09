package com.sudoajay.picsum.main.repository

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.sudoajay.picsum.databinding.LayoutPersonListBinding
import com.sudoajay.picsum.main.MainActivity
import com.sudoajay.picsum.main.model.PersonGson
import com.sudoajay.picsum.main.model.PersonJackson


class PersonPagingAdapterJackson(
    private var mainActivity: MainActivity

) :
    PagingDataAdapter<PersonJackson, PersonViewHolder>(Person_COMPARATOR) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PersonViewHolder(
            mainActivity,
            LayoutPersonListBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }



    companion object {
        private val Person_COMPARATOR = object : DiffUtil.ItemCallback<PersonJackson>() {
            override fun areItemsTheSame(oldItem: PersonJackson, newItem: PersonJackson): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: PersonJackson, newItem: PersonJackson): Boolean =
                oldItem == newItem
        }
    }


}