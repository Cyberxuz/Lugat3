package com.example.lugat3;

public class Game {
    String uzbek;
    String eglish;
    String rus;

    public Game() {
    }

    public Game(String uzbek, String eglish, String rus) {
        this.uzbek = uzbek;
        this.eglish = eglish;
        this.rus = rus;
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

    public String getRus() {
        return rus;
    }

    public void setRus(String rus) {
        this.rus = rus;
    }
}
