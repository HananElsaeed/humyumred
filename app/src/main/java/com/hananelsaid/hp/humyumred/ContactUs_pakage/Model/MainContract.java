package com.hananelsaid.hp.humyumred.ContactUs_pakage.Model;

import android.content.Intent;

public interface MainContract {
    interface IView {}
    interface IViewPresenter{
        Intent sendmail();
        Intent calling();
    }
    interface IModelPresnter{}
    interface IModel{}
}
