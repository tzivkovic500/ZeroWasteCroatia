package com.example.android.zerowastecroatia;

/**
 * Created by Tea on 26.8.2018..
 */

public class WebTour {

    /**
     * String resource ID for the image of the place
     */
    private int mImageResourceId;
    /**
     * String resource ID for the name of the place
     */
    private int mTextResourceId;

    /**
     * String resource ID for the web of the place
     */
    private String mUrlId;

    public WebTour(int imageResourceId, int textResourceId, String urlId) {
        mImageResourceId = imageResourceId;
        mTextResourceId = textResourceId;
        mUrlId = urlId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getTextResourceId() {
        return mTextResourceId;
    }

    public String getUrlId() {
        return mUrlId;
    }
}


