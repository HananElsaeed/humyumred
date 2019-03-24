package com.hananelsaid.hp.humyumred.User_Registration_package.Presenter;

import android.util.Log;

import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainContractInterface;
import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainRegModel;

public class PresenterScreen3 implements MainContractInterface.IPresenterScreen3 {

    MainContractInterface.IModel rmodel;
    MainContractInterface.IViewRegScreen3 view;
    String password;

    public PresenterScreen3(MainContractInterface.IViewRegScreen3 view)
    {
        this.view=view;
        rmodel=new MainRegModel(this);
    }

    @Override
    public void catchUserPassword(String password) {
        this.password = password;

    }

    @Override
    public void registTheUser() {
        if (rmodel.ResponseState()) {
            Log.i("onClick", "onClick");
            view.onResponse();
        } else view.onFailure();
    }
}
