package com.team6.haw.apogeos.CustomTypes;

import java.io.Serializable;

/**
 * Created by talal on 27.03.16.
 */
public class RankingTyp implements Serializable {

    private Integer likes;
    private Integer unlikes;

    public RankingTyp() {}

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getUnlikes() {
        return unlikes;
    }

    public void setUnlikes(Integer unlikes) {
        this.unlikes = unlikes;
    }

    @Override
    public String toString() {
        return "RankingTyp{" +
                "likes=" + likes +
                ", unlikes=" + unlikes +
                '}';
    }
}
