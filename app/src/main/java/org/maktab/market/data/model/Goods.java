package org.maktab.market.data.model;

import org.maktab.market.data.retrofit.respone.CollectionItem;
import org.maktab.market.data.room.GoodsDao;

public class Goods {
    //from room
    public Goods(GoodsDao goodsDao) {
    }

    //from retrofit
    public Goods(CollectionItem collectionItem) {
    }
}
