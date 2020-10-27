package org.maktab.market.data.local.room.old;

import android.content.Context;

import androidx.room.Room;

import org.maktab.market.data.local.room.GoodsDB;
import org.maktab.market.data.local.room.SchemaGoods;

public class GooodsDBClient {
    private static GooodsDBClient mInstance;
    private GoodsDB mDB;

    private GooodsDBClient(Context context) {
        mDB = Room.databaseBuilder(context, GoodsDB.class, SchemaGoods.DATABASE_NAME).build();
    }

    public static GooodsDBClient newInstance(Context context) {
        if (mInstance == null)
            mInstance = new GooodsDBClient(context);
        return mInstance;
    }
}
