package com.kyp.morenaruto.kyp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class KYPMainActivity extends AppCompatActivity {
    @BindView(R.id.cat_name)
    TextView catNameTextView;

    @BindView(R.id.cat_breed)
    TextView catBreedTextView;

    @BindView(R.id.cat_personality)
    TextView catPersonalityTextView;

    @BindView(R.id.next_activity)
    Button nextActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyp_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
