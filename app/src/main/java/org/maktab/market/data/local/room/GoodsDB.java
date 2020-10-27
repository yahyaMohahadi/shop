package org.maktab.market.data.local.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import org.maktab.market.data.model.Goods;

@Database(entities = {Goods.class}, version = SchemaGoods.VERSION, exportSchema = false)
public abstract class GoodsDB extends RoomDatabase {
    public abstract GoodsDao getDao();

    public static GoodsDB newInstance(Context context) {
        GoodsDB db = Room.databaseBuilder(context, GoodsDB.class, SchemaGoods.DATABASE_NAME).build();
        return db;
    }
}
