package com.kyp.morenaruto.kyp.activities;

import android.annotation.TargetApi;
import android.os.Build;

import com.google.gson.Gson;
import com.kyp.morenaruto.kyp.BuildConfig;
import com.kyp.morenaruto.kyp.activities.player.Player;
import com.kyp.morenaruto.kyp.activities.player.PlayerPosition;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static com.kyp.morenaruto.kyp.activities.player.PlayerPosition.*;
import static java.util.Arrays.asList;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class KYPMainActivityTest {

    private KYPMainActivity activity;

    @Before
    public void setUp(){
        activity = Robolectric.setupActivity(KYPMainActivity.class);
    }

    @Test
    public void onCreate() throws Exception {
    }
}