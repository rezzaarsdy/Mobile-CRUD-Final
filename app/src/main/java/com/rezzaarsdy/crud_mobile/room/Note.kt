package com.rezzaarsdy.crud_mobile.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var title: String,
    var note: String
)