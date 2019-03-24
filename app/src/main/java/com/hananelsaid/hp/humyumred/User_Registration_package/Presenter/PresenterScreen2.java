package com.hananelsaid.hp.humyumred.User_Registration_package.Presenter;

import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainContractInterface;
import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainRegModel;

public class PresenterScreen2 implements MainContractInterface.IPresenterScreen2 {
    MainContractInterface.IModel rmodel;
    MainContractInterface.IViewRegScreen2 view;
    private String email, phone;

    public PresenterScreen2(MainContractInterface.IViewRegScreen2 view) {
        this.view=view;
        rmodel=new MainRegModel(this);

    }

    @Override
    public void catchUserEmailandPhone(String email, String phone) {
        this.email=email;
        this.phone=phone;

    }
}
