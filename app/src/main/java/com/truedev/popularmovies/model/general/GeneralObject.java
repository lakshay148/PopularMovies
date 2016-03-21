package com.truedev.popularmovies.model.general;

/**
 * Created by lakshaygirdhar on 21/3/16.
 */
public class GeneralObject {

    String imagePath;
    String title;

    public GeneralObject(String imagePath, String title) {
        this.imagePath = imagePath;
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
