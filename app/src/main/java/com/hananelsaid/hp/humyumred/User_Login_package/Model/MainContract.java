package com.hananelsaid.hp.humyumred.User_Login_package.Model;

import java.util.List;

public interface MainContract {
    interface IView { void validUser();
        void unvalidUser();}
    interface IModel{
        Boolean responseStatus();
        void getData(String email ,String password) ;

    }
    interface IViewPresenter{
        void catchdata(String email ,String password);
        void checkResponseThenOpenHome();

    }
    interface IModelPresenter{
       }

}
