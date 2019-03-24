package com.hananelsaid.hp.humyumred.User_Registration_package.View;


import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hananelsaid.hp.humyumred.R;
import com.hananelsaid.hp.humyumred.Terms_package.TermsActivity;
import com.hananelsaid.hp.humyumred.User_Registration_package.Model.MainContractInterface;
import com.hananelsaid.hp.humyumred.User_Registration_package.Presenter.MainRegPresenter;
import com.hananelsaid.hp.humyumred.User_Registration_package.Presenter.PresenterScreen1;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstScreen_Fragment extends Fragment implements MainContractInterface.IViewRegScreen1{
    Fragment screen2;
    Button continue1;
    EditText firstname, lastname;
    TextView terms_et;
    private MainContractInterface.IPresenterScreen1 presenter;
    private PresenterScreen1 cpresenter;



    public FirstScreen_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_screen_, container, false);
        // collect user data
        firstname = view.findViewById(R.id.userRegFirstName_editText);
        lastname = view.findViewById(R.id.userRegLastName_editText);
        continue1 = view.findViewById(R.id.continue1_btn);
        terms_et=view.findViewById(R.id.terms_et);
        terms_et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), TermsActivity.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0,0);

            }
        });
        //init presenter instance
        presenter= new PresenterScreen1(this);
        cpresenter = new PresenterScreen1(this);
        continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = firstname.getText().toString();
                String lname = lastname.getText().toString();

                if (!TextUtils.isEmpty(fname) && !TextUtils.isEmpty(lname)) {
                    presenter.catchUserFandSName(fname,lname);
                    openSecodScreen();
                }
                else Toast.makeText(getActivity(), "you should enter your first and second name", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    void openSecodScreen() {

        screen2 = new SecondScreen_Fragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, screen2); // give your fragment container id in first parameter
        transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
        transaction.commit();

    }


}