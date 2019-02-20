
package com.hananelsaid.hp.humyumred.User_Registration_package.UserRegDataModel;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Errors {

    @SerializedName("email")
    private List<String> mEmail;
    @SerializedName("phone")
    private List<String> mPhone;
    @SerializedName("register_token")
    private List<String> mRegisterToken;

    public List<String> getEmail() {
        return mEmail;
    }

    public void setEmail(List<String> email) {
        mEmail = email;
    }

    public List<String> getPhone() {
        return mPhone;
    }

    public void setPhone(List<String> phone) {
        mPhone = phone;
    }

    public List<String> getRegisterToken() {
        return mRegisterToken;
    }

    public void setRegisterToken(List<String> registerToken) {
        mRegisterToken = registerToken;
    }

}
