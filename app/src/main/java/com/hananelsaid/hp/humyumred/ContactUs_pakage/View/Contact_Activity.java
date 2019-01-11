package com.hananelsaid.hp.humyumred.ContactUs_pakage.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hananelsaid.hp.humyumred.ContactUs_pakage.Model.MainContract;
import com.hananelsaid.hp.humyumred.ContactUs_pakage.Presenter.MainPresenter;
import com.hananelsaid.hp.humyumred.R;

public class Contact_Activity extends AppCompatActivity implements MainContract.IView {
    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        mPresenter= new MainPresenter();
    }

    public void sendEmail(View view) {
startActivity(mPresenter.sendmail());

    }

    public void callUs(View view) {
        startActivity(mPresenter.calling());
    }
}
