package ru.kpfu.itis.model;

import java.io.Serializable;

/**
 * Created by Ilnur on 06.04.14.
 *
 * Human object class.
 *
 * @version 1.0
 */
public class Human implements Serializable {
    private String mName;

    public Human() {
    }

    public Human(String mName) {
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (mName != null ? !mName.equals(human.mName) : human.mName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return mName != null ? mName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Human{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
