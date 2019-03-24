package com.hananelsaid.hp.humyumred.User_Registration_package.Model;

import com.hananelsaid.hp.humyumred.User_Registration_package.UserRegDataModel.RootRegClass;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserRegisterRetInterface  {
    @FormUrlEncoded
    @POST("api/user/register")
    Call<RootRegClass> getUserData(@Field("first_name") String first_name ,
                                   @Field("last_name") String last_name,
                                   @Field("email")String email,
                                   @Field("password") String password ,
                                   @Field("phone") String phone,
                                   @Field("register_token") String register_token);


}
