package com.pbm.ramadhanberkahrevisi1.Hadist;

public class Hadist {
    private String judul;
    private String paragraf;

    public Hadist(String judul, String paragraf) {
        this.judul = judul;
        this.paragraf = paragraf;
    }

    public String getParagraf() {
        return paragraf;
    }

    public void setParagraf(String paragraf) {
        this.paragraf = paragraf;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
