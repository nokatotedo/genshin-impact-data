package com.dicoding.genshinapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Artifact implements Parcelable {
    private String name;
    private String artifactone;
    private String detailartifactone;
    private String artifacttwo;
    private String detailartifacttwo;
    private String domain;
    private int card;
    private int artifacta;
    private int artifactb;
    private int artifactc;
    private int artifactd;

    public Artifact() {
    }

    protected Artifact(Parcel in) {
        name = in.readString();
        artifactone = in.readString();
        detailartifactone = in.readString();
        artifacttwo = in.readString();
        detailartifacttwo = in.readString();
        domain = in.readString();
        card = in.readInt();
        artifacta = in.readInt();
        artifactb = in.readInt();
        artifactc = in.readInt();
        artifactd = in.readInt();
    }

    public static final Creator<Artifact> CREATOR = new Creator<Artifact>() {
        @Override
        public Artifact createFromParcel(Parcel in) {
            return new Artifact(in);
        }

        @Override
        public Artifact[] newArray(int size) {
            return new Artifact[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtifactOne() {
        return artifactone;
    }

    public void setArtifactOne(String artifactone) {
        this.artifactone = artifactone;
    }

    public String getDetailArtifactOne() {
        return detailartifactone;
    }

    public void setDetailArtifactOne(String detailartifactone) {
        this.detailartifactone = detailartifactone;
    }

    public String getArtifactTwo() {
        return artifacttwo;
    }

    public void setArtifactTwo(String artifacttwo) {
        this.artifacttwo = artifacttwo;
    }

    public String getDetailArtifactTwo() {
        return detailartifacttwo;
    }

    public void setDetailArtifactTwo(String detailartifacttwo) {
        this.detailartifacttwo = detailartifacttwo;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(artifactone);
        dest.writeString(detailartifactone);
        dest.writeString(artifacttwo);
        dest.writeString(detailartifacttwo);
        dest.writeString(domain);
        dest.writeInt(card);
        dest.writeInt(artifacta);
        dest.writeInt(artifactb);
        dest.writeInt(artifactc);
        dest.writeInt(artifactd);
    }
}