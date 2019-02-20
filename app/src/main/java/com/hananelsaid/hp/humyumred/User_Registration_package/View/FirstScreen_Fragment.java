package com.hananelsaid.hp.humyumred.User_Registration_package.View;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hananelsaid.hp.humyumred.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstScreen_Fragment extends Fragment {
    Fragment screen2 ;
    Button continue1;

    public FirstScreen_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_screen_, container, false);
        continue1 = view.findViewById(R.id.continue1_btn);
        continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen2 = new SecondScreen_Fragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, screen2); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();


            }
        });

        return view;
    }

}
