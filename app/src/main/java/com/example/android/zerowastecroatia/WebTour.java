package com.example.android.zerowastecroatia;

/**
 * Created by Tea on 26.8.2018..
 */

public class WebTour {

    /**
     * String resource ID for the image of the place
     */
    private int wImageResourceId;
    /**
     * String resource ID for the name of the place
     */
    private int wTextResourceId;

    /**
     * String resource ID for the web of the place
     */
    private String wUrlId;

    public WebTour(int imageResourceId, int textResourceId, String urlId) {
        wImageResourceId = imageResourceId;
        wTextResourceId = textResourceId;
        wUrlId = urlId;
    }

    public int getImageResourceId() {
        return wImageResourceId;
    }

    public int getTextResourceId() {
        return wTextResourceId;
    }

    public String getUrlId() {
        return wUrlId;
    }
}


