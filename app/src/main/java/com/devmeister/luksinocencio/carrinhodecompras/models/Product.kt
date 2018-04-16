package com.devmeister.luksinocencio.carrinhodecompras.models

import android.os.Parcel
import android.os.Parcelable


data class Product(val id: Long,
									 val prod_name: String,
									 val prod_desc: String,
									 val prod_price: Double) : Parcelable {
	companion object CREATOR : Parcelable.Creator<Product> {
		override fun createFromParcel(parcel: Parcel): Product {
			return Product(parcel)
		}

		override fun newArray(size: Int): Array<Product?> {
			return arrayOfNulls(size)
		}
	}

	constructor(parcel: Parcel) : this(
			parcel.readLong(),
			parcel.readString(),
			parcel.readString())

	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeLong(id)
		parcel.writeString(prod_name)
		parcel.writeString(prod_desc)
		parcel.writeDouble(prod_price)
	}

	override fun describeContents(): Int {
		return 0
	}
}