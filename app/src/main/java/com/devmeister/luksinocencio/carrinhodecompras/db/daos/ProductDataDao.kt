package com.devmeister.luksinocencio.carrinhodecompras.db.daos

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.devmeister.luksinocencio.carrinhodecompras.db.entities.ProductData


@Dao
interface ProductDataDao {

	@Query("SELECT * from productData")
	fun getAll(): List<ProductData>

	@Insert(onConflict = REPLACE)
	fun insert(productData: ProductData)

	@Query("DELETE from productData")
	fun deleteAll()
}