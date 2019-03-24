package com.hananelsaid.hp.humyumred.User_Registration_package.Presenter;

import android.util.Log;

import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainContractInterface;
import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainRegModel;

public class MainRegPresenter implements MainContractInterface.IViewPresenter, MainContractInterface.IModelPresenter {
    MainContractInterface.IModel rmodel;
    MainContractInterface.IView rview;

    private String firstName, secondName, email, phone, password;

    public MainRegPresenter(MainContractInterface.IView view) {
        this.rview = view;
        rmodel = new MainRegModel(this);

    }

    @Override
    public void uploadData() {
        rmodel.setUserData(firstName, secondName, email, password, phone);

    }
}
