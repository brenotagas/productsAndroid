package com.devmeister.luksinocencio.carrinhodecompras.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import com.devmeister.luksinocencio.carrinhodecompras.db.daos.ProductDataDao
import com.devmeister.luksinocencio.carrinhodecompras.db.entities.ProductData

@Database(entities = arrayOf(ProductData::class), version = 1)
abstract class Database : RoomDatabase() {

	abstract fun productDao(): ProductDataDao
}