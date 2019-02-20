package com.hananelsaid.hp.humyumred.User_Login_package.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hananelsaid.hp.humyumred.Home_package.View.Home_Activity;
import com.hananelsaid.hp.humyumred.R;
import com.hananelsaid.hp.humyumred.User_Login_package.Model.MainContract;
import com.hananelsaid.hp.humyumred.User_Login_package.Model.MainContract.IView;
import com.hananelsaid.hp.humyumred.User_Login_package.Model.MySingleton;
import com.hananelsaid.hp.humyumred.User_Login_package.Presenter.MainPresenter;
import com.hananelsaid.hp.humyumred.User_Registration_package.View.User_Register_Activity;

import java.util.ArrayList;
import java.util.List;

public class Login_Activity extends AppCompatActivity implements IView {

    private MainPresenter presenter;
    private MainContract.IViewPresenter presenterinstance;
    TextView userRegister;
    EditText userEmail_Etxt, userPassword_Etxt;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        MySingleton.initializeDB(getApplicationContext());
        presenter = new MainPresenter(this);
        presenterinstance = new MainPresenter(this);
        userRegister = findViewById(R.id.userRegister_txt);
        userEmail_Etxt = findViewById(R.id.userRegFirstName_editText);
        userPassword_Etxt = findViewById(R.id.userRegLastName_editText);
        login=findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = userEmail_Etxt.getText().toString();
                String userPassword = userPassword_Etxt.getText().toString();
                presenterinstance.catchdata(userEmail,userPassword);
                presenterinstance.checkResponseThenOpenHome();



            }
        });


        userRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login_Activity.this, User_Register_Activity.class);
                startActivity(i);
            }
        });




    }


    @Override
    public void validUser() {
        Intent i = new Intent(Login_Activity.this, Home_Activity.class);
        startActivity(i);
    }
}
