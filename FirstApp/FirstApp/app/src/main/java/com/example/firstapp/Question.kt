package com.example.firstapp

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)