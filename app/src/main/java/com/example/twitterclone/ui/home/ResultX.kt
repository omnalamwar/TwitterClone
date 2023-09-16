package com.example.twitterclone.ui.home

data class ResultX(
    val __typename: String,
    val affiliates_highlighted_label: AffiliatesHighlightedLabel,
    val has_graduated_access: Boolean,
    val id: String,
    val is_blue_verified: Boolean,
    val legacy: Legacy,
    val professional: Professional,
    val profile_image_shape: String,
    val rest_id: String
)