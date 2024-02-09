package com.tps.practice.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MyBusinessLibrary {

    protected void writeHelloWorld(Context context) {
        Toast.makeText(context, "Hello World", Toast.LENGTH_LONG).show();
    }
}
