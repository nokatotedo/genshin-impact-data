package com.dicoding.genshinapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Weapon implements Parcelable {
    private String name;
    private String baseatk;
    private String second;
    private String passive;
    private String ability;
    private int card;
    private int background;

    public Weapon() {
    }

    protected Weapon(Parcel in) {
        name = in.readString();
        baseatk = in.readString();
        second = in.readString();
        passive = in.readString();
        ability = in.readString();
        card = in.readInt();
        background = in.readInt();
    }

    public static final Creator<Weapon> CREATOR = new Creator<Weapon>() {
        @Override
        public Weapon createFromParcel(Parcel in) {
            return new Weapon(in);
        }

        @Override
        public Weapon[] newArray(int size) {
            return new Weapon[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseatk() {
        return baseatk;
    }

    public void setBaseatk(String baseatk) {
        this.baseatk = baseatk;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getPassive() {
        return passive;
    }

    public void setPassive(String passive) {
        this.passive = passive;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(baseatk);
        dest.writeString(second);
        dest.writeString(passive);
        dest.writeString(ability);
        dest.writeInt(card);
        dest.writeInt(background);
    }
}