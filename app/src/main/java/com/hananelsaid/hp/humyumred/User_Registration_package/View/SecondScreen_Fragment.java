package com.hananelsaid.hp.humyumred.User_Registration_package.View;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;


import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.hananelsaid.hp.humyumred.R;
import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainContractInterface;
import com.hananelsaid.hp.humyumred.User_Registration_package.Presenter.MainRegPresenter;
import com.hananelsaid.hp.humyumred.User_Registration_package.Presenter.PresenterScreen2;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondScreen_Fragment extends Fragment implements MainContractInterface.IViewRegScreen2 {
    Fragment screen3;
    Button continue2;
    EditText email_et, phone_et;
    //presenter instance
    private MainContractInterface.IPresenterScreen2 presenter;
    private PresenterScreen2 cpresenter;

    public SecondScreen_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_screen, container, false);

        //UI objects
        continue2 = view.findViewById(R.id.continue2_btn);
        email_et = view.findViewById(R.id.userRegEmail_editText);
        phone_et = view.findViewById(R.id.userRegPhoneNum_editText);
        //init presenter object

        presenter = new PresenterScreen2(this);
        cpresenter = new PresenterScreen2(this);
        continue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = email_et.getText().toString();
                String phone = phone_et.getText().toString();
                if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(phone)) {
                    presenter.catchUserEmailandPhone(email, phone);
                    openThirdScreen();
                }


            }
        });


        return view;
    }

    void openThirdScreen() {
        screen3 = new ThirdScreen_Fragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, screen3); // give your fragment container id in first parameter
        transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
        transaction.commit();
    }

}
