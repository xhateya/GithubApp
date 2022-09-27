package com.xhateya.idn.githubapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var username: String?= null,
    var location: String?= null,
    var avatar: Int,
    var name: String?= null,
    var about: String?= null,
    var company: String?= null,
    var followers: String?= null,
    var following: String?= null,
    var repository: String?=null,


):Parcelable
