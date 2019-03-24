package com.hananelsaid.hp.humyumred.User_Login_package.Model;

import com.hananelsaid.hp.humyumred.User_Login_package.DataModel.RootClass;
import com.hananelsaid.hp.humyumred.User_Login_package.DataModel.User;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserLoginRetrofit {
   @FormUrlEncoded
   @POST("api/login")
    Call<RootClass> getUserData(@Field("email") String email ,@Field("password") String password,@Field("register_token")String register_token);


}