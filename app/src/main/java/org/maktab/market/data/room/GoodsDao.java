package org.maktab.market.data.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import org.maktab.market.data.room.model.GoodsRoomModel;

import java.util.List;

@Dao
public interface GoodsDao {
    @Query("SELECT * FROM goods")
    LiveData<List<GoodsRoomModel>> getAllGoods();
}
