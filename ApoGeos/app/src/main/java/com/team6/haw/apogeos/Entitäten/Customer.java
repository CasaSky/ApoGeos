package com.team6.haw.apogeos.Entitäten;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.team6.haw.apogeos.CustomTypes.HelperTyp;
import com.team6.haw.apogeos.CustomTypes.RankingTyp;
import com.team6.haw.apogeos.CustomTypes.SeriennummerTyp;

/**
 * Created by talal on 27.03.16.
 */

@DatabaseTable(tableName = "customer")
public class Customer {

    @DatabaseField
    private String name;
    @DatabaseField
    private String vorname;
    @DatabaseField(id = true)
    private SeriennummerTyp seriennummer;
    @DatabaseField
    private HelperTyp helper;
    @DatabaseField
    private RankingTyp ranking;

    public Customer() {
        // ORMLite needs a no-arg constructor
    }

    public Customer(String name, String vorname, SeriennummerTyp seriennummer) {

        this.name = name;
        this.vorname = vorname;
        this.seriennummer = seriennummer;
    }

    public Customer(String name, String vorname, SeriennummerTyp seriennummer, HelperTyp helper, RankingTyp ranking) {

        this.name = name;
        this.vorname = vorname;
        this.seriennummer = seriennummer;
        this.helper = helper;
        this.ranking = ranking;
    }

    public void moreLikes() {

        ranking.setLikes(ranking.getLikes());
    }

    public void moreUnlikes() {

        ranking.setUnlikes(ranking.getUnlikes());
    }
}
