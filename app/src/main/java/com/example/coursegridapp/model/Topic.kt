package com.example.coursegridapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val amountAssociatedCourses: Int,
    @DrawableRes val imageResourceId: Int
)
