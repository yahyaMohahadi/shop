package org.maktab.market.data.retrofit;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("wp-json/wc/v3/products?consumer_key=ck_e068367636f27ca5dbe40fafb93e3a29498f394e&consumer_secret=cs_e31a58025e0253edeaab4d3a508b9235e826fdbf")
    Call<List<GoodsRespone>> doGetList();
}
