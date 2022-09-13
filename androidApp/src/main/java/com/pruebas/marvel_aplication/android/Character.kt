package com.pruebas.marvel_aplication.android

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity (tableName = "saved_character")
class Character() {
    @ColumnInfo(name = "id")
    var id: Long = 1

    @ColumnInfo(name = "name")
    var name: String = ""

    @ColumnInfo(name = "description")
    var description: String = ""

    @ColumnInfo(name = "thumbnailURL")
    var thumbnailUrl: String = ""

    constructor(
        id: Long,
        name: String,
        description: String,
        thumbnailUrl: String
    ) : this() {
        this.id = id
        this.name = name
        this.description = description
        this.thumbnailUrl = thumbnailUrl
    }
}