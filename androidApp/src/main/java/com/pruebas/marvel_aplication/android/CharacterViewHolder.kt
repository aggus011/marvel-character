package com.pruebas.marvel_aplication.android

import androidx.recyclerview.widget.RecyclerView
import com.pruebas.marvel_aplication.android.Character
import com.pruebas.marvel_aplication.android.databinding.ListItemCharacterBinding
import com.squareup.picasso.Picasso

class CharacterViewHolder(private val binding: ListItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(character: Character) {
        binding.name.text = character.name
        binding.description.text = character.description
        if (character.thumbnailUrl.isNotEmpty()) {
            Picasso.get()
                .load(character.thumbnailUrl)
                .into(binding.image)
        } else {
            binding.image.setImageURI(null)
        }
    }

}
