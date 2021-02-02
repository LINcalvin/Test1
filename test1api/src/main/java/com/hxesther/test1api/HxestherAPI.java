package com.hxesther.test1api;

import android.content.Context;
import android.widget.Toast;

public class HxestherAPI {
    public static void ShowMyToast(Context context, String text, int length){
        Toast.makeText(context, text, length).show();
    }
}
