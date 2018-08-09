package com.example.android.zerowastecroatia;

/**
 * Created by Tea on 2.8.2018..
 */
public class Tour {
    /** String resource ID for the image of the place */
    private int mImageResourceId;
    /** String resource ID for the name of the place */
    private int mTextResourceId;
    /** String resource ID for the info of the place */
    private int iTextResourceId;
    /** String resource ID for the location of the place */
    private String mUrlLocation;
    /** String resource ID for the web of the place */
    private String mUrlId;
    public Tour (int imageResourceId, int textResourceId, int textInfoId, String locationId, String urlId) {
        mImageResourceId = imageResourceId;
        mTextResourceId = textResourceId;
        iTextResourceId = textInfoId;
        mUrlLocation = locationId;
        mUrlId = urlId;
    }
    public int getImageResourceId(){return mImageResourceId; }
    public int getTextResourceId() {return mTextResourceId;}
    public int getTextInfoId() {return iTextResourceId;    }
    public String getLocationId(){
        return  mUrlLocation;
    }
    public String getUrlId(){
        return mUrlId;
    }
}
