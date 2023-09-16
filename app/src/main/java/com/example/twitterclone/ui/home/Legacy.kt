package com.example.twitterclone.ui.home

data class Legacy(
    val can_dm: Boolean,
    val can_media_tag: Boolean,
    val created_at: String,
    val default_profile: Boolean,
    val default_profile_image: Boolean,
    val description: String,
    val entities: Entities,
    val fast_followers_count: Int,
    val favourites_count: Int,
    val followers_count: Int,
    val friends_count: Int,
    val has_custom_timelines: Boolean,
    val is_translator: Boolean,
    val listed_count: Int,
    val location: String,
    val media_count: Int,
    val name: String,
    val normal_followers_count: Int,
    val pinned_tweet_ids_str: List<Any>,
    val possibly_sensitive: Boolean,
    val profile_banner_url: String,
    val profile_image_url_https: String,
    val profile_interstitial_type: String,
    val screen_name: String,
    val statuses_count: Int,
    val translator_type: String,
    val url: String,
    val verified: Boolean,
    val want_retweets: Boolean,
    val withheld_in_countries: List<Any>
)