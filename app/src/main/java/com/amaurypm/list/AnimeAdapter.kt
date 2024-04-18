package com.amaurypm.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.amaurypm.list.databinding.ElementoListaBinding

class AnimeAdapter(private val context: Context, val animes: ArrayList<Anime>): BaseAdapter() {

    override fun getCount(): Int = animes.size


    override fun getItem(position: Int): Any = animes[position]


    override fun getItemId(position: Int): Long = animes[position].id

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding = ElementoListaBinding.inflate(LayoutInflater.from(context))

        binding.apply {
            tvTitulo.text = animes[position].titulo
            tvTipo.text = animes[position].tipo
            tvFecha.text = animes[position].fecha


        }

        return binding.root
    }

}