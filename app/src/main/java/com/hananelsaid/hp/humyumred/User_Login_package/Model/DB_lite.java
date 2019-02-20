package com.hananelsaid.hp.humyumred.User_Login_package.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_lite extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MyDBName.db";
    public static final String CONTACTS_TABLE_NAME = "contacts";

    public DB_lite(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table Contact(id integer primary key ," +
                "mAccessToken text,email text,first_name text,last_name text," +
                "phone text,register_token text ,role text,updated_at text )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Contact");
        onCreate(sqLiteDatabase);

    }
    public boolean insertContact(String mAccessToken, String email,String first_name,
                                 String last_name,String phone,
                                 String register_token,String role,String updated_at) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mAccessToken", mAccessToken);
        contentValues.put("email", email);
        contentValues.put("first_name", first_name);
       // contentValues.put("kitchen", kitchen);
        contentValues.put("last_name", last_name);
        contentValues.put("phone", phone);
        contentValues.put("register_token", register_token);
        contentValues.put("role", role);
        contentValues.put("updated_at", updated_at);

        long result = db.insert("Contact", null, contentValues);
        if (result==-1)
            return false;
        else
            return true;
    }


}
