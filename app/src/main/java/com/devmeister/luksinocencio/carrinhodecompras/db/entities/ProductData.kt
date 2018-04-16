package com.devmeister.luksinocencio.carrinhodecompras.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "productData")
data class ProductData(@PrimaryKey(autoGenerate = true) var id: Long?,
											 @ColumnInfo(name = "prod_name") var prod_name: String,
											 @ColumnInfo(name = "prod_desc") var prod_desc: String,
											 @ColumnInfo(name = "prod_price") var prod_prices: Double

){
	constructor():this(null, "","", 0.0)
}