package org.maktab.market.data.repository;

import android.content.Context;

import androidx.annotation.NonNull;

import org.maktab.market.data.retrofit.ApiClient;
import org.maktab.market.data.retrofit.ApiInterface;
import org.maktab.market.data.retrofit.GoodsRespone;

import java.io.IOException;
import java.util.List;

public class GoodsRepository {
    private static GoodsRepository mInstance;
    private List<GoodsRespone> mGoodsRespones;

    public static GoodsRepository newInstance(Context context) {
        if (mInstance == null)
            mInstance = new GoodsRepository(context);
        return mInstance;
    }

    public GoodsRepository(Context context) {

    }

    public void addNewGoods(@NonNull List<GoodsRespone> listResponse) {
        if (mGoodsRespones != null)
            mGoodsRespones.addAll(listResponse);
        else mGoodsRespones = listResponse;
    }

    public void getListGoods() {
        List<GoodsRespone> listResponse;
        try {
            listResponse = ApiClient.getClient().create(ApiInterface.class).doGetList().execute().body();
            if (listResponse != null) {
                addNewGoods(listResponse);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getListGoods(int page) {
        //todo get page goods
        getListGoods();
    }
}
