package com.example.viewpager2tablayout

import android.os.Parcel
import android.os.Parcelable

class Page(val name: String, val url: String, val ic: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(url)
        parcel.writeInt(ic)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Page> {
        val pages = mutableListOf(
            Page("Яндекс", "https://ya.ru/", R.drawable.ya_ic),
            Page("Google", "https://www.google.com/", R.drawable.google_ic),
            Page("Git", "https://github.com/", R.drawable.git_ic)
        )

        override fun createFromParcel(parcel: Parcel): Page {
            return Page(parcel)
        }

        override fun newArray(size: Int): Array<Page?> {
            return arrayOfNulls(size)
        }
    }
}