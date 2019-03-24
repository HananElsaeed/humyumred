package com.hananelsaid.hp.humyumred.User_Registration_package.View;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hananelsaid.hp.humyumred.R;
import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainContractInterface;
import com.hananelsaid.hp.humyumred.User_Registration_package.Presenter.MainRegPresenter;
import com.hananelsaid.hp.humyumred.User_Registration_package.Presenter.PresenterScreen3;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdScreen_Fragment extends Fragment implements MainContractInterface.IViewRegScreen3 {


    Button continue3;
    EditText password_et;

    //presenter instance
    private MainContractInterface.IPresenterScreen3 presenter;
    private PresenterScreen3 cpresenter;


    public ThirdScreen_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third_screen_, container, false);
        //UI objects
        continue3 = view.findViewById(R.id.continue3_btn);
        password_et = view.findViewById(R.id.userRegPassword_editText);
        //init presenter object
        presenter = new PresenterScreen3(this);
        cpresenter = new PresenterScreen3(this);
        continue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = password_et.getText().toString();
                presenter.catchUserPassword(password);
              // presenter.uploadData();
                presenter.registTheUser();
            }
        });

        return view;
    }


    @Override
    public void onFailure() {

    }

    @Override
    public void onResponse() {

    }
}