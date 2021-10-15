package com.example.parstagram;
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParceApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zfzA9c7hNnSsHpD3tUTNLBVGeRfgC8Gr3cwqwFMD")
                .clientKey("2Tdb8Bm6EFbJEabHhw89JMwsl06e81oZTkYcJ40L")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
