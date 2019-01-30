package com.hananelsaid.hp.humyumred.Terms_package;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hananelsaid.hp.humyumred.R;

public class TermsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
        getSupportActionBar().setTitle("Terms and Condition");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
