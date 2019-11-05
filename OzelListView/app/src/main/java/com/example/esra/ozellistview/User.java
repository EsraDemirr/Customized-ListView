package com.example.esra.ozellistview;


public class User  {
    private String isim;
    private boolean kadinMi;



    public User(String isim, boolean kadinMi) {
        this.isim = isim;
        this.kadinMi = kadinMi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isKadinMi() {
        return kadinMi;
    }

    public void setKadinMi(boolean kadinMi) {
        this.kadinMi = kadinMi;
    }
}
