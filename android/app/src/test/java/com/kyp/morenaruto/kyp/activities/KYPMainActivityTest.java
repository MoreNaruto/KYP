package com.kyp.morenaruto.kyp.activities;

import android.widget.SpinnerAdapter;

import com.kyp.morenaruto.kyp.BuildConfig;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class KYPMainActivityTest {

    private KYPMainActivity activity;

    @Before
    public void setUp(){
        activity = Robolectric.setupActivity(KYPMainActivity.class);
    }

    @Test
    public void onCreate_firstPlayerAdapter_firstItemShouldBeLarryBird() throws Exception {
        SpinnerAdapter adapter = activity.firstPlayerSpinner.getAdapter();

        assertEquals(adapter.getItem(0), "Larry Bird");
    }

    @Test
    public void onCreate_secondPlayerAdapter_thirdItemShouldBeMichaelJordan() throws Exception {
        SpinnerAdapter adapter = activity.secondPlayerSpinner.getAdapter();

        assertEquals(adapter.getItem(2), "Michael Jordan");
    }
}