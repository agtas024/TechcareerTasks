package com.example.task_6;

import java.io.Serializable;

public class Market implements Serializable {
    private int ID;
    private String urunAdi;
    private String urunResimAdi;

    public Market() {
    }

    public Market(int ID, String urunAdi, String urunResimAdi) {
        this.ID = ID;
        this.urunAdi = urunAdi;
        this.urunResimAdi = urunResimAdi;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunResimAdi() {
        return urunResimAdi;
    }

    public void setUrunResimAdi(String urunResimAdi) {
        this.urunResimAdi = urunResimAdi;
    }
}
