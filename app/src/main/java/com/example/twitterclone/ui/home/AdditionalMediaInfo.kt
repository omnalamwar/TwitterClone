package com.example.twitterclone.ui.home

data class AdditionalMediaInfo(
    val description: String,
    val embeddable: Boolean,
    val monetizable: Boolean,
    val source_user: SourceUser,
    val title: String
)