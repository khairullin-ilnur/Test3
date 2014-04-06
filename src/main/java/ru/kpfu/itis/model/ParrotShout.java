package ru.kpfu.itis.model;

/**
 * Created by Ilnur on 06.04.14.
 *
 * ParrotShout object class.
 *
 * @version 1.0
 */

public class ParrotShout {
    private String mShout;

    public ParrotShout() {
    }

    public ParrotShout(String mShout) {
        this.mShout = mShout;
    }

    public String getmShout() {
        return mShout;
    }

    public void setmShout(String mShout) {
        this.mShout = mShout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParrotShout that = (ParrotShout) o;

        if (mShout != null ? !mShout.equals(that.mShout) : that.mShout != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return mShout != null ? mShout.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ParrotShout{" +
                "mShout='" + mShout + '\'' +
                '}';
    }
}
