package org.maktab.market.ui.main.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.maktab.market.R;
import org.maktab.market.data.retrofit.ApiInterface;

public class MainActivity extends AppCompatActivity {

    ApiInterface mApiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
     /*
 for test retrofit
 new Thread(new Runnable() {
            @Override
            public void run() {
                mApiInterface  = ApiClient.getClient().create(ApiInterface.class);
                try {
                    Response<List<CategoriesItem>> categoriesItems= mApiInterface.doGetList().execute();
                    for (CategoriesItem categoriesItem:categoriesItems.body()) {
                        Log.d("QQQ",categoriesItem.getId()+"");
                        Log.d("QQQ",categoriesItem.getName()+"");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();*/
}