package com.team6.haw.apogeos.CustomTypes;

import java.io.Serializable;

/**
 * Created by talal on 27.03.16.
 */
public class SeriennummerTyp implements Serializable {

    private String nummer;

    public SeriennummerTyp(String nummer) {
        if (checkIfValid(nummer))
            throw new IllegalArgumentException("Die gegebene IMEI Nummer ist nicht valid!");
        else
            this.nummer = nummer;
    }

    private boolean checkIfValid(String nummer) {
        return nummer.length()==15;
    }

    @Override
    public String toString() {
        return "SeriennummerTyp{" +
                "nummer='" + nummer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeriennummerTyp)) return false;

        SeriennummerTyp that = (SeriennummerTyp) o;

        return nummer.equals(that.nummer);

    }

    @Override
    public int hashCode() {
        return nummer.hashCode();
    }

    public String getNummer() {

        return nummer;
    }
}
