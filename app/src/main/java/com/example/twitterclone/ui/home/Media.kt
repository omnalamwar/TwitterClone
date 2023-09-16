package com.example.twitterclone.ui.home

data class Media(
    val additional_media_info: AdditionalMediaInfo,
    val display_url: String,
    val expanded_url: String,
    val ext_alt_text: String,
    val ext_media_availability: ExtMediaAvailability,
    val features: Features,
    val id_str: String,
    val indices: List<Int>,
    val media_key: String,
    val media_url_https: String,
    val original_info: OriginalInfo,
    val sizes: Sizes,
    val source_status_id_str: String,
    val source_user_id_str: String,
    val type: String,
    val url: String,
    val video_info: VideoInfo
)