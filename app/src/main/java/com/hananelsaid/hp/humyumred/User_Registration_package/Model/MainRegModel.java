package com.hananelsaid.hp.humyumred.User_Registration_package.Model;

import com.hananelsaid.hp.humyumred.User_Registration_package.UserRegDataModel.RootRegClass;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.hananelsaid.hp.humyumred.Constants.API_BASE_URL;

public class MainRegModel implements MainContractInterface.IModel {
    Boolean sucessOrNot=false;
    static String token = "eqwO3RnBYsE:APA91bF1KdcyfWBdKWextD50MomtQ5vHLZpTzUA83_3qwZgYcJ3NW87Vv3WKk4pEFUThKo_V_Z0AUf7G8Zd1Zi_JtJr_wJ2Ax7p6DyihV3r5Rhl-1zCTW3H3WzWLoqrW0JqijD9aFhbwWpCNtqnHERwK1tRadBIzpQ";

    MainContractInterface.IModelPresenter rpresenter;
    MainContractInterface.IPresenterScreen1 ps1;
    MainContractInterface.IPresenterScreen2 ps2;
    MainContractInterface.IPresenterScreen3 ps3;

    public MainRegModel(MainContractInterface.IPresenterScreen1 ps1) {
        this.ps1 = ps1;
    }
    public MainRegModel(MainContractInterface.IPresenterScreen2 ps2) {
        this.ps2 = ps2;
    }
    public MainRegModel(MainContractInterface.IPresenterScreen3 ps3) {
        this.ps3 = ps3;
    }
    public MainRegModel(MainContractInterface.IModelPresenter presenter) {
        this.rpresenter = presenter;
    }





    @Override
    public void setUserData(String first_name, String last_name, String email,
                            String password, String phone) {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(API_BASE_URL).
                addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.client(httpClient.build()).build();
        UserRegisterRetInterface clientreg = retrofit.create(UserRegisterRetInterface.class);
        Call<RootRegClass> data = clientreg.getUserData(first_name, last_name, email, password, phone, token);
        data.enqueue(new Callback<RootRegClass>() {
            @Override
            public void onResponse(Call<RootRegClass> call, Response<RootRegClass> response) {
                if (response.code() == 200) {
                    sucessOrNot=true;

                }
            }

            @Override
            public void onFailure(Call<RootRegClass> call, Throwable t) {
                sucessOrNot=false;

            }
        });


    }
    @Override
    public Boolean ResponseState() {
        return sucessOrNot;
    }
}
