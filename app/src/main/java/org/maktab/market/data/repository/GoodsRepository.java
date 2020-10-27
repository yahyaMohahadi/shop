package org.maktab.market.data.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import org.maktab.market.data.room.GoodsDB;
import org.maktab.market.data.room.model.GoodsRoomModel;

import java.util.List;

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

    private LiveData<List<GoodsRoomModel>> getAllGods() {
        return mDB.getDao().getAllGoods();
    }
}
