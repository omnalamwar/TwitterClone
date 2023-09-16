package com.example.twitterclone.ui.home

data class VideoInfo(
    val aspect_ratio: List<Int>,
    val duration_millis: Int,
    val variants: List<Variant>
)