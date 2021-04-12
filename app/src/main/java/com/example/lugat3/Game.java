package com.example.lugat3;

import com.orm.SugarRecord;

public class Game extends SugarRecord {

    String uzbek;
    String eglish;
    String ruski;

    public Game() {
    }

    public Game(String uzbek, String eglish, String ruski) {
        this.uzbek = uzbek;
        this.eglish = eglish;
        this.ruski = ruski;

    }

    public String getUzbek() {
        return uzbek;
    }

    public void setUzbek(String uzbek) {
        this.uzbek = uzbek;
    }

    public String getEglish() {
        return eglish;
    }

    public void setEglish(String eglish) {
        this.eglish = eglish;
    }

    public String getRuski() {
        return ruski;
    }

    public void setRuski(String ruski) {
        this.ruski = ruski;
    }
}
