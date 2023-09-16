package com.example.twitterclone.ui.home

data class Result(
    val binding_values: Any,
    val bookmark_count: Int,
    val conversation_id: String,
    val creation_date: String,
    val expanded_url: String,
    val extended_entities: ExtendedEntities,
    val favorite_count: Int,
    val in_reply_to_status_id: String,
    val language: String,
    val media_url: List<String>,
    val quote_count: Int,
    val quoted_status_id: String,
    val reply_count: Int,
    val retweet: Boolean,
    val retweet_count: Int,
    val retweet_status: Any,
    val retweet_tweet_id: Any,
    val source: String,
    val text: String,
    val timestamp: Int,
    val tweet_id: String,
    val user: User,
    val video_url: Any,
    val video_view_count: Any,
    val views: Int
)