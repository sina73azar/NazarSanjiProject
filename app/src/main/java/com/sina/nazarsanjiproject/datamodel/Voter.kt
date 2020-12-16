package com.sina.nazarsanjiproject.datamodel

import android.os.Parcel
import android.os.Parcelable

data class Voter(
    val firstName: String?,
    val lastName: String?,
    val age: Int,
    val phone: Long
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readLong()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(firstName)
        parcel.writeString(lastName)
        parcel.writeInt(age)
        parcel.writeLong(phone)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Voter> {
        override fun createFromParcel(parcel: Parcel): Voter {
            return Voter(parcel)
        }

        override fun newArray(size: Int): Array<Voter?> {
            return arrayOfNulls(size)
        }
    }
}
