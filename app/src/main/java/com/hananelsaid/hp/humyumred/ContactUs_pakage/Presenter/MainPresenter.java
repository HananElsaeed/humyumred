package com.hananelsaid.hp.humyumred.ContactUs_pakage.Presenter;

import android.content.Intent;
import android.net.Uri;

import com.hananelsaid.hp.humyumred.ContactUs_pakage.Model.MainContract;

public class MainPresenter implements MainContract.IViewPresenter {
    @Override
    public Intent sendmail() {
        Intent sendEmail = new Intent(Intent.ACTION_SEND);
        sendEmail.setData(Uri.parse("mailto:"));
        sendEmail.setType("message/rfc822");
        sendEmail.putExtra(Intent.EXTRA_EMAIL,"humyum@support.com");
        sendEmail.putExtra(Intent.EXTRA_TEXT, "text subject");
     return sendEmail;

    }

    @Override
    public Intent calling() {
        String number = "+123512351";
        Intent caller = new Intent(Intent.ACTION_DIAL);
        caller.setData(Uri.parse("tel:" + number));
        return caller ;
        }



}
