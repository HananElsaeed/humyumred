
package com.hananelsaid.hp.humyumred.User_Registration_package.UserRegDataModel;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RootRegClass {

    @SerializedName("errors")
    private Errors mErrors;
    @SerializedName("status")
    private Long mStatus;

    public Errors getErrors() {
        return mErrors;
    }

    public void setErrors(Errors errors) {
        mErrors = errors;
    }

    public Long getStatus() {
        return mStatus;
    }

    public void setStatus(Long status) {
        mStatus = status;
    }

}
