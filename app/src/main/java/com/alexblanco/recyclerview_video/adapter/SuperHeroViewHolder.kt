package com.alexblanco.recyclerview_video.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.alexblanco.recyclerview_video.R
import com.alexblanco.recyclerview_video.SuperHero
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class SuperHeroViewHolder(view: View):ViewHolder(view) {

    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)


    fun render(superHeroModel: SuperHero){
        superHero.text = superHeroModel.superHero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher
        Glide.with(photo.context).load(superHeroModel.photo).into(photo)
    }
}