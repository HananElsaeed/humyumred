package com.hananelsaid.hp.humyumred.User_Login_package.Model;

import android.util.Log;
import android.widget.Toast;

import com.hananelsaid.hp.humyumred.User_Login_package.DataModel.RootClass;
import com.hananelsaid.hp.humyumred.User_Login_package.DataModel.User;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainModel implements MainContract.IModel {

    private MainContract.IModelPresenter presenter;

    String email;
    String password;
    Boolean status = false;
    static  String token ="eqwO3RnBYsE:APA91bF1KdcyfWBdKWextD50MomtQ5vHLZpTzUA83_3qwZgYcJ3NW87Vv3WKk4pEFUThKo_V_Z0AUf7G8Zd1Zi_JtJr_wJ2Ax7p6DyihV3r5Rhl-1zCTW3H3WzWLoqrW0JqijD9aFhbwWpCNtqnHERwK1tRadBIzpQ";


    public MainModel(MainContract.IModelPresenter presenter) {
        this.presenter = presenter;
    }

    public void catchemailandpass() {



    }


    @Override
    public void getData(String email ,String password) {

        String API_BASE_URL = "http://backend.devolum.com/humyum/public/";
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(API_BASE_URL).addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.client(httpClient.build()).build();
        UserLoginRetrofit client = retrofit.create(UserLoginRetrofit.class);
        //catch user email and password
        catchemailandpass();

        // Fetch a list of the Github repositories.
        Call<RootClass> call = client.getUserData(email, password,token);
        call.enqueue(new Callback<RootClass>() {


            @Override
            public void onResponse(Call<RootClass> call, Response<RootClass> response) {

                User user = response.body().getUser();
               // Log.i("firstname", user.getFirstName());
                //using singleton and the data base
                DB_lite db = MySingleton.getInstance().getDB();
                db.insertContact(user.getAccessToken(), user.getEmail(), user.getFirstName(),
                        user.getLastName(), user.getPhone(), user.getRegisterToken(), user.getRole(), user.getUpdatedAt());

                Log.i("onResponse: ", db.toString());
                status = true;

            }

            @Override
            public void onFailure(Call<RootClass> call, Throwable t) {
                Log.i("onFailure", t.getMessage());

                status = false;

            }
        });


    }

    @Override
    public Boolean responseStatus() {
        return status;
    }
}