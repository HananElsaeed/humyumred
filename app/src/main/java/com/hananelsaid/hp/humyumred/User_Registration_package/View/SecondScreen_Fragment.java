package com.hananelsaid.hp.humyumred.User_Registration_package.View;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hananelsaid.hp.humyumred.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondScreen_Fragment extends Fragment {
    Fragment screen3;
    Button continue2;

    public SecondScreen_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_screen, container, false);

        continue2 = view.findViewById(R.id.continue2_btn);
        continue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen3 = new ThirdScreen_Fragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, screen3); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();

            }
        });


        return view;
    }

}
