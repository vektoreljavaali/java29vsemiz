/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spormerkeziprojesi.Model;

/**
 *
 * @author sd
 */
public class Calısan extends Kisi{
    private int kacYıllıkCalısan;
    private int tecrubeYili;
    private int maas;
    private String calismaSaati;

    public int getKacYıllıkCalısan() {
        return kacYıllıkCalısan;
    }

    public void setKacYıllıkCalısan(int kacYıllıkCalısan) {
        this.kacYıllıkCalısan = kacYıllıkCalısan;
    }

    public int getTecrubeYili() {
        return tecrubeYili;
    }

    public void setTecrubeYili(int tecrubeYili) {
        this.tecrubeYili = tecrubeYili;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getCalismaSaati() {
        return calismaSaati;
    }

    public void setCalismaSaati(String calismaSaati) {
        this.calismaSaati = calismaSaati;
    }
}
