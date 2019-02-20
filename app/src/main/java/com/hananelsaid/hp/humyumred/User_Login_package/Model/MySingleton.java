package com.hananelsaid.hp.humyumred.User_Login_package.Model;

import android.content.Context;


public class MySingleton {
    private static MySingleton mInstance;
    private DB_lite dbInstance;
    private static Context mCtx;

    private MySingleton(Context context) {
        mCtx = context;
        dbInstance = getDB();
    }

    public static synchronized MySingleton initializeDB(Context context) {
        if (mInstance == null) {
            mInstance = new MySingleton(context);
        }
        return mInstance;
    }

    public static MySingleton getInstance() {
        return mInstance;
    }


    public DB_lite getDB() {
        if (dbInstance == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            dbInstance =  new DB_lite(mCtx.getApplicationContext());
        }
        return dbInstance;
    }




}
