package com.team6.haw.apogeos.CustomTypes;

import java.io.Serializable;

/**
 * Created by talal on 27.03.16.
 */
public class HelperTyp implements Serializable {

    private String kategorie;
    private String bezeichnung;

    public HelperTyp(Kategories kategorie, String bezeichnung) {

        if (kategorie == null)
            throw new NullPointerException("Kategorie darf nicht null sein: Bitte Kategories enum angucken!");
        else
            this.kategorie = kategorie.toString();

        this.bezeichnung = bezeichnung;
    }


    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return "HelperTyp{" +
                "kategorie='" + kategorie + '\'' +
                ", bezeichnung='" + bezeichnung + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HelperTyp)) return false;

        HelperTyp helperTyp = (HelperTyp) o;

        if (!kategorie.equals(helperTyp.kategorie)) return false;
        return bezeichnung.equals(helperTyp.bezeichnung);

    }

    @Override
    public int hashCode() {
        int result = kategorie.hashCode();
        result = 31 * result + bezeichnung.hashCode();
        return result;
    }

    public enum Kategories {
        PRIVATPERSON, NGO, GO
    }

}
