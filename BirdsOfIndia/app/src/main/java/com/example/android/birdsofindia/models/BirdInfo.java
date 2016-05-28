package com.example.android.birdsofindia.models;

/**
 * Created by vardhan on 27-05-2016.
 */
public class BirdInfo {

    public final int imgId;
    public final String name;
    public final String sciName;
    public final String desc;
    public final int extImgId;
    public final String url;
    public final String sound;

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
