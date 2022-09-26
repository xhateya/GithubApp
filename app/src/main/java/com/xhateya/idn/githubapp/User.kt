package com.xhateya.idn.githubapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var username: String,
    var name: String,
    var avatar: Int,
    var repository: String?=null,
    var about: String?= null,
    var company: String?= null,
    var followers: String?= null,
    var following: String?= null,
    var location: String?= null,

):Parcelable
