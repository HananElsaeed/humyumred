package com.hananelsaid.hp.humyumred.User_Registration_package.Model;

import android.widget.Toast;

import com.hananelsaid.hp.humyumred.User_Registration_package.View.User_Register_Activity;

public interface MainContractInterface {

    interface IView {

    }
    interface IModel {
        Boolean ResponseState();

        void setUserData(String first_name, String last_name, String email,
                         String password, String phone);
    }

    interface IViewPresenter {
        void uploadData();

    }

    interface IPresenterScreen1 {
        void catchUserFandSName(String firstName, String secondName);
    }

    interface IPresenterScreen2 {
        void catchUserEmailandPhone(String email, String phone);
    }

    interface IPresenterScreen3 {
        void registTheUser();
        void catchUserPassword(String password);
    }
    interface IViewRegScreen1 {
    }

    interface IViewRegScreen2 {

    }

    interface IViewRegScreen3 {
        void onFailure();

        void onResponse();
    }

    interface IModelPresenter {
    }

}
