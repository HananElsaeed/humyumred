package com.hananelsaid.hp.humyumred.User_Login_package.Presenter;

import com.hananelsaid.hp.humyumred.User_Login_package.Model.MainContract;
import com.hananelsaid.hp.humyumred.User_Login_package.Model.MainContract.IModelPresenter;
import com.hananelsaid.hp.humyumred.User_Login_package.Model.MainContract.IViewPresenter;
import com.hananelsaid.hp.humyumred.User_Login_package.Model.MainModel;

import java.util.List;

public class MainPresenter implements IViewPresenter, IModelPresenter {
    MainContract.IView view;
    MainContract.IModel model;



    public MainPresenter(MainContract.IView view) {
        this.view = view;
        model = new MainModel(this);

    }

    public void checkResponseThenOpenHome() {
       if (model.responseStatus())
       { view.validUser(); }
       else {view.unvalidUser();}
    }


    public void catchdata(String email ,String password)
    {
        model.getData(email,password);
    }


}
