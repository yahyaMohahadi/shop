package org.maktab.market.ui.main.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.maktab.market.R;
import org.maktab.market.service.InternetService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InternetService.enqueueWork(this, InternetService.getIntent(this, 0));
    }
}