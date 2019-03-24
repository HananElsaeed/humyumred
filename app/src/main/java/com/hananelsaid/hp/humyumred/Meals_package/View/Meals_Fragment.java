package com.hananelsaid.hp.humyumred.Meals_package.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hananelsaid.hp.humyumred.Meals_package.Model.MealsContractInterface;
import com.hananelsaid.hp.humyumred.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Meals_Fragment extends Fragment implements MealsContractInterface.IView {


    public Meals_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meals_, container, false);
    }

}
