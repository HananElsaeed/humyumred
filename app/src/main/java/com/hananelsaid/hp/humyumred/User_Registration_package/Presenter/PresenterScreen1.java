package com.hananelsaid.hp.humyumred.User_Registration_package.Presenter;

import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainContractInterface;
import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainRegModel;

public class PresenterScreen1 implements MainContractInterface.IPresenterScreen1 {
    MainContractInterface.IModel rmodel;
    MainContractInterface.IViewRegScreen1 view;

    private String firstName, secondName;

    public PresenterScreen1(MainContractInterface.IViewRegScreen1 view) {
        this.view=view;
        rmodel=new MainRegModel(this);

    }
    @Override
    public void catchUserFandSName(String firstName, String secondName) {
        this.firstName=firstName;
        this.secondName=secondName;

    }
}
