/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ogrenciisleriotomasyonu;

/**
 *
 * @author MONSTER
 */
public class urunlerim {
  private String etek;
  private String kazak;
  private String ceket;
  private String ayakkabi;
  private String canta;
  private String yuzuk;
  private String pantolon;
  private String teknolojikAletler;
  private String EvEsyalari;   

    public urunlerim(String etek, String kazak, String ceket, String ayakkabı, String canta, String yüzük, String pantolon, String teknolojikAletler, String EvEsyalari) {
        this.etek = etek;
        this.kazak = kazak;
        this.ceket = ceket;
        this.ayakkabi= ayakkabı;
        this.canta = canta;
        this.yuzuk = yüzük;
        this.pantolon = pantolon;
        this.teknolojikAletler = teknolojikAletler;
        this.EvEsyalari = EvEsyalari;
    }

    public String getEtek() {
        return etek;
    }

    public void setEtek(String etek) {
        this.etek = etek;
    }

    public String getKazak() {
        return kazak;
    }

    public void setKazak(String kazak) {
        this.kazak = kazak;
    }

    public String getCeket() {
        return ceket;
    }

    public void setCeket(String ceket) {
        this.ceket = ceket;
    }

    public String getAyakkabı() {
        return ayakkabi;
    }

    public void setAyakkabı(String ayakkabı) {
        this.ayakkabi = ayakkabı;
    }

    public String getCanta() {
        return canta;
    }

    public void setCanta(String canta) {
        this.canta = canta;
    }

    public String getYüzük() {
        return yuzuk;
    }

    public void setYüzük(String yüzük) {
        this.yuzuk = yüzük;
    }

    public String getPantolon() {
        return pantolon;
    }

    public void setPantolon(String pantolon) {
        this.pantolon = pantolon;
    }

    public String getTeknolojikAletler() {
        return teknolojikAletler;
    }

    public void setTeknolojikAletler(String teknolojikAletler) {
        this.teknolojikAletler = teknolojikAletler;
    }

    public String getEvEsyalari() {
        return EvEsyalari;
    }

    public void setEvEsyalari(String EvEsyalari) {
        this.EvEsyalari = EvEsyalari;
    }

    @Override
    public String toString() {
        return "urunlerim{" + "etek=" + etek + ", kazak=" + kazak + ", ceket=" + ceket + ", ayakkab\u0131=" + ayakkabi + ", canta=" + canta + ", y\u00fcz\u00fck=" + yuzuk+ ", pantolon=" + pantolon + ", teknolojikAletler=" + teknolojikAletler + ", EvEsyalari=" + EvEsyalari + '}';
    }
           
  
  
           
 
}
