package com.platinaace.smartmedibox;


import android.app.Application;
import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Wc4QtS01V4zgtqClq62Xr9N576gm3td9wCQADxNh")       // from Back4App
                .clientKey("YHTFO08MxvDk8c7B6JUJjzdaQ4tVHBc7MwQhC6YV")       // from Back4App
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}