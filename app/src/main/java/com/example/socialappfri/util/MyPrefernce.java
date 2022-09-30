package com.example.socialappfri.util;

import android.content.Context;
import android.content.SharedPreferences;

public abstract class MyPrefernce {


    private static SharedPreferences.Editor editor;
    private static SharedPreferences shared;
    public static SharedPreferences.Editor getEditorInstance(Context context){
        if (editor == null)
            editor = context.getSharedPreferences("shared",Context.MODE_PRIVATE)
                    .edit();

        return editor;
    }

    public static SharedPreferences getSharedInstance(Context context){

        if (shared ==null)
            shared=context.getSharedPreferences("shared",Context.MODE_PRIVATE);

        return shared;

    }


}
