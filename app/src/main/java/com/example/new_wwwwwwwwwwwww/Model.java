package com.example.new_wwwwwwwwwwwww;

import android.net.Uri;

public class Model {

    private String title, url;


    //************************************************************
    public Model() {
    }

    public Model(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
