package com.kyp.morenaruto.kyp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kyp.morenaruto.kyp.R;
import com.kyp.morenaruto.kyp.activities.player.Player;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class KYPMainActivity extends Activity {
    @BindView(R.id.first_player)
    Spinner firstPlayerSpinner;

    @BindView(R.id.second_player)
    Spinner secondPlayerSpinner;

    @BindView(R.id.next_activity)
    Button nextActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyp_main);
        ButterKnife.bind(this);

        List<String> nameOfPlayers = getPlayersNames();

        ArrayAdapter<String> firstPlayerAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, nameOfPlayers);
        ArrayAdapter<String> secondPlayerAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, nameOfPlayers);

        firstPlayerSpinner.setAdapter(firstPlayerAdapter);
        secondPlayerSpinner.setAdapter(secondPlayerAdapter);

        nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KYPMainActivity.this, ContentKYPActivity.class);
                startActivity(intent);
            }
        });
    }

    @NonNull
    private List<String> getPlayersNames() {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(getResources().openRawResource(R.raw.players));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));

        Type listType = new TypeToken<ArrayList<Player>>() {}.getType();
        List<Player> players = new Gson().fromJson(bufferedReader, listType);
        List<String> nameOfPlayers = new ArrayList<>();

        for (Player player : players) {
            nameOfPlayers.add(player.getName());
        }
        return nameOfPlayers;
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
