package com.kyp.morenaruto.kyp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.kyp.morenaruto.kyp.R;
import com.kyp.morenaruto.kyp.activities.cats.Cat;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.kyp.morenaruto.kyp.activities.cats.CatTypes.catBreeds;
import static com.kyp.morenaruto.kyp.activities.cats.CatTypes.catNames;
import static com.kyp.morenaruto.kyp.activities.cats.CatTypes.catPersonalities;
import static java.lang.Math.random;

public class KYPMainActivity extends Activity {
    public static final int NUMBER_OF_DIFFERENT_CAT_PERMUTATIONS = 17;
    public List<Cat> allGeneratedCats = new ArrayList<Cat>();
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
        ButterKnife.bind(this);

        Double randomNumberForCatTypeDouble = random() * NUMBER_OF_DIFFERENT_CAT_PERMUTATIONS;

        catBreedTextView.setText(catBreeds().get(randomNumberForCatTypeDouble.intValue()));
        catNameTextView.setText(catNames().get(randomNumberForCatTypeDouble.intValue()));
        catPersonalityTextView.setText(catPersonalities().get(randomNumberForCatTypeDouble.intValue()));
    }

    @Override
    protected void onStart() {
        Cat cat = new Cat();

        cat.setBreed(catBreedTextView.getText().toString());
        cat.setName(catNameTextView.getText().toString());
        cat.setPersonality(catPersonalityTextView.getText().toString());

        allGeneratedCats.add(cat);
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
