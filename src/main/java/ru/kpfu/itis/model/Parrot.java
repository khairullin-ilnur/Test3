package ru.kpfu.itis.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ilnur on 06.04.14.
 *
 * Parrot object class.
 *
 * @version 1.0
 */
public class Parrot implements Serializable {
    private Human mOwner;
    private List<ParrotShout> mParrotShout;
    private String mName;

    public Parrot() {
    }

    public Parrot(Human mOwner, List<ParrotShout> mParrotShout, String mName) {
        this.mOwner = mOwner;
        this.mParrotShout = mParrotShout;
        this.mName = mName;
    }

    public Human getmOwner() {
        return mOwner;
    }

    public void setmOwner(Human mOwner) {
        this.mOwner = mOwner;
    }

    public List<ParrotShout> getmParrotShout() {
        return mParrotShout;
    }

    public void setmParrotShout(List<ParrotShout> mParrotShout) {
        this.mParrotShout = mParrotShout;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String saySpeech() {
        String answer;
        answer = "Hello! My name is " + mName + ". My owner is " + mOwner.getmName() + ".";
        answer += "I know some words: ";
        for (ParrotShout parrotShout : mParrotShout) {
            answer += parrotShout.getmShout() + " ";
        }
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parrot parrot = (Parrot) o;

        if (mName != null ? !mName.equals(parrot.mName) : parrot.mName != null) return false;
        if (mOwner != null ? !mOwner.equals(parrot.mOwner) : parrot.mOwner != null) return false;
        if (mParrotShout != null ? !mParrotShout.equals(parrot.mParrotShout) : parrot.mParrotShout != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mOwner != null ? mOwner.hashCode() : 0;
        result = 31 * result + (mParrotShout != null ? mParrotShout.hashCode() : 0);
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "mOwner=" + mOwner +
                ", mParrotShout=" + mParrotShout +
                ", mName='" + mName + '\'' +
                '}';
    }
}

