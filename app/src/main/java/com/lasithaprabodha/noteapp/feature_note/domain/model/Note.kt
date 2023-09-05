package com.lasithaprabodha.noteapp.feature_note.domain.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lasithaprabodha.noteapp.ui.theme.BabyBlue
import com.lasithaprabodha.noteapp.ui.theme.LightGreen
import com.lasithaprabodha.noteapp.ui.theme.RedOrange
import com.lasithaprabodha.noteapp.ui.theme.RedPink
import com.lasithaprabodha.noteapp.ui.theme.Violet
import java.lang.Exception

@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)