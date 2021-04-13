package com.h5190059_buse_alkan.model;

public class Soru {
    public String soru;
    public String cevap1;
    public String cevap2;
    public String cevap3;
    public String cevap4;
    public int dogruCevap;

    public Soru(){

    }

    public Soru(String soru, String cevap1, String cevap2, String cevap3, String cevap4, int dogruCevap) {
        this.soru = soru;
        this.cevap1 = cevap1;
        this.cevap2 = cevap2;
        this.cevap3 = cevap3;
        this.cevap4 = cevap4;
        this.dogruCevap = dogruCevap;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getCevap1() {
        return cevap1;
    }

    public void setCevap1(String cevap1) {
        this.cevap1 = cevap1;
    }

    public String getCevap2() {
        return cevap2;
    }

    public void setCevap2(String cevap2) {
        this.cevap2 = cevap2;
    }

    public String getCevap3() {
        return cevap3;
    }

    public void setCevap3(String cevap3) {
        this.cevap3 = cevap3;
    }

    public String getCevap4() {
        return cevap4;
    }

    public void setCevap4(String cevap4) {
        this.cevap4 = cevap4;
    }

    public int getDogruCevap() {
        return dogruCevap;
    }

    public void setDogruCevap(int dogruCevap) {
        this.dogruCevap = dogruCevap;
    }
}
