/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spormerkeziprojesi.Model;

import java.util.Date;

/**
 *
 * @author sd
 */
public class Kisi {
    
    private String adi;
    private String soyAdi;
    private int tcKimlik;
    private String eposta;
    private boolean cinsiyet;
    private int telefon;
    private int acilTelefon;
    private Date dogumTarihi;
    private String kanGrubu;
    private int boy;
    private int kilo;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public int getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(int tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public boolean isCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getAcilTelefon() {
        return acilTelefon;
    }

    public void setAcilTelefon(int acilTelefon) {
        this.acilTelefon = acilTelefon;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getKanGrubu() {
        return kanGrubu;
    }

    public void setKanGrubu(String kanGrubu) {
        this.kanGrubu = kanGrubu;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
    
        
}
