package org.maktab.market.data.local.repository;

import android.content.Context;

import org.maktab.market.data.local.room.GoodsDB;

public class GoodsRepository {
    private static GoodsRepository mInstance;
    private GoodsDB mDB;

    public static GoodsRepository newInstance(Context context) {
        if (mInstance == null)
            mInstance = new GoodsRepository(context);
        return mInstance;
    }

    public GoodsRepository(Context context) {
        mDB = GoodsDB.newInstance(context);
    }
}
