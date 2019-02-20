package com.hananelsaid.hp.humyumred.User_Registration_package.View;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hananelsaid.hp.humyumred.Home_package.View.Home_Activity;
import com.hananelsaid.hp.humyumred.R;
import com.hananelsaid.hp.humyumred.Splash_package.Splash_Activity;

public class User_Register_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,new FirstScreen_Fragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();



    }


}
