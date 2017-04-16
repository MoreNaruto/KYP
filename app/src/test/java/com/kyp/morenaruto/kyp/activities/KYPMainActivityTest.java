package com.kyp.morenaruto.kyp.activities;

import android.widget.TextView;

import com.kyp.morenaruto.kyp.BuildConfig;
import com.kyp.morenaruto.kyp.R;
import com.kyp.morenaruto.kyp.activities.cats.CatTypes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class KYPMainActivityTest {

    private KYPMainActivity activity;
    private TextView catBreedTextView;
    private TextView catPersonalityTextView;
    private TextView catNameTextView;

    @Before
    public void setUp(){
        activity = Robolectric.setupActivity(KYPMainActivity.class);

        catBreedTextView = (TextView) activity.findViewById(R.id.cat_breed);
        catPersonalityTextView = (TextView) activity.findViewById(R.id.cat_personality);
        catNameTextView = (TextView) activity.findViewById(R.id.cat_name);
    }

    @Test
    public void onCreate_setRandomCatInformation() {
        assertTrue(CatTypes.catBreeds().contains(catBreedTextView.getText().toString()));
        assertTrue(CatTypes.catPersonalities().contains(catPersonalityTextView.getText().toString()));
        assertTrue(CatTypes.catNames().contains(catNameTextView.getText().toString()));
    }
}