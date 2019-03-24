package com.hananelsaid.hp.humyumred.User_Registration_package.View;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hananelsaid.hp.humyumred.Home_package.View.Home_Activity;
import com.hananelsaid.hp.humyumred.R;
import com.hananelsaid.hp.humyumred.Splash_package.Splash_Activity;
import com.hananelsaid.hp.humyumred.User_Login_package.Model.MySingleton;
import com.hananelsaid.hp.humyumred.User_Login_package.View.Login_Activity;
import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainContractInterface;
import com.hananelsaid.hp.humyumred.User_Registration_package.Presenter.MainRegPresenter;

public class User_Register_Activity extends AppCompatActivity implements MainContractInterface.IView {
    //Presenter interface instance
    private MainContractInterface.IViewPresenter mPresenter;
    // presenter class instance
    private MainRegPresenter presenter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, new FirstScreen_Fragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        //Single ton intialization
       // MySingleton.initializeDB(getApplicationContext());
        // init  the presenter instances
        presenter = new MainRegPresenter(this);
        mPresenter = new MainRegPresenter(this);

    }


    @Override
    public void onFailure() {
        Toast.makeText(User_Register_Activity.this, "please check the internet connection", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResponse() {
        Intent i = new Intent(User_Register_Activity.this, Home_Activity.class);
        startActivity(i);
    }


}
