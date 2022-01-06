package com.phrase.example;

import android.app.Application;
import android.content.Context;

import com.phrase.android.sdk.Phrase;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Phrase.setup(this, "8e1f1b1ddddf056b9e377ad69e4416fc", "HVFDaiW7AsdQot0ih06Iw05uClnmv423Y--PInURrkw");
        Phrase.updateTranslations();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(Phrase.wrapApplicationContext(newBase));
    }
}
