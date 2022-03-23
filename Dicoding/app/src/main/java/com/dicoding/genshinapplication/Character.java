package com.dicoding.genshinapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Character implements Parcelable {
    private String name;
    private String ability;
    private String info;
    private String artifactone;
    private String artifacttwo;
    private int photo;
    private int card;
    private int vision;
    private int artifacta;
    private int artifactb;
    private int artifactc;
    private int artifactd;

    public Character() {
    }

    protected Character(Parcel in) {
        name = in.readString();
        ability = in.readString();
        info = in.readString();
        artifactone = in.readString();
        artifacttwo = in.readString();
        photo = in.readInt();
        card = in.readInt();
        vision = in.readInt();
        artifacta = in.readInt();
        artifactb = in.readInt();
        artifactc = in.readInt();
        artifactd = in.readInt();
    }

    public static final Creator<Character> CREATOR = new Creator<Character>() {
        @Override
        public Character createFromParcel(Parcel in) {
            return new Character(in);
        }

        @Override
        public Character[] newArray(int size) {
            return new Character[size];
        }
    };

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getArtifactOne() {
        return artifactone;
    }

    public void setArtifactOne(String artifact) {
        this.artifactone = artifact;
    }

    public String getArtifactTwo() {
        return artifacttwo;
    }

    public void setArtifactTwo(String artifact) {
        this.artifacttwo = artifact;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getArtifacta() {
        return artifacta;
    }

    public void setArtifacta(int artifacta) {
        this.artifacta = artifacta;
    }

    public int getArtifactb() {
        return artifactb;
    }

    public void setArtifactb(int artifactb) {
        this.artifactb = artifactb;
    }

    public int getArtifactc() {
        return artifactc;
    }

    public void setArtifactc(int artifactc) {
        this.artifactc = artifactc;
    }

    public int getArtifactd() {
        return artifactd;
    }

    public void setArtifactd(int artifactd) {
        this.artifactd = artifactd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(ability);
        dest.writeString(info);
        dest.writeString(artifactone);
        dest.writeString(artifacttwo);
        dest.writeInt(photo);
        dest.writeInt(card);
        dest.writeInt(vision);
        dest.writeInt(artifacta);
        dest.writeInt(artifactb);
        dest.writeInt(artifactc);
        dest.writeInt(artifactd);
    }
}