package org.maktab.market.data.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import org.maktab.market.data.room.model.GoodsRoomModel;
import org.maktab.market.data.room.model.convertors.RoomConverters;
import org.maktab.market.data.room.schema.SchemaGoods;

@Database(entities = {GoodsRoomModel.class}, version = SchemaGoods.VERSION, exportSchema = false)
@TypeConverters(RoomConverters.class)
public abstract class GoodsDB extends RoomDatabase {
    public abstract GoodsDao getDao();

    public static GoodsDB newInstance(Context context) {
        GoodsDB db = Room.databaseBuilder(context, GoodsDB.class, SchemaGoods.DATABASE_NAME).build();
        return db;
    }
}
