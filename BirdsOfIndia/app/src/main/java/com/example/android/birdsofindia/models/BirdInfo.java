package com.example.android.birdsofindia.models;

/**
 * Created by vardhan on 27-05-2016.
 */
public class BirdInfo {

    public final int imgId; /* Resource ID of bird image */
    public final String name; /* Birds common name */
    public final String sciName; /* Birds scientific name */
    public final String desc; /* Description */
    public final int extImgId; /* extinction image ID */
    public final String url; /* Wikipedia URL */
    public final String sound; /* bird sound resource ID */

    public BirdInfo(int imgId, String name, String sciName, String desc, int extImgId, String url, String sound) {
        this.imgId = imgId;
        this.name = name;
        this.sciName = sciName;
        this.desc = desc;
        this.extImgId = extImgId;
        this.url = url;
        this.sound = sound;
    }

    public BirdInfo(BirdInfo rhs) {
        this.imgId = rhs.imgId;
        this.name = rhs.name;
        this.sciName = rhs.sciName;
        this.desc = rhs.desc;
        this.extImgId = rhs.extImgId;
        this.url = rhs.url;
        this.sound = rhs.sound;
    }
}
