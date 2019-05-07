/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author asus
 */
public class Bahasa {

    private String indo;
    private String ngoko;
    private String kromo;
    private int angka;

    /**
     * @return the indo
     */
    public String getIndo() {
        return indo;
    }

    /**
     * @param indo the indo to set
     */
    public void setIndo(String indo) {
        this.indo = indo;
    }

    /**
     * @return the ngoko
     */
    public String getNgoko() {
        return ngoko;
    }

    /**
     * @param ngoko the ngoko to set
     */
    public void setNgoko(String ngoko) {
        this.ngoko = ngoko;
    }

    /**
     * @return the kromo
     */
    public String getKromo() {
        return kromo;
    }

    /**
     * @param kromo the kromo to set
     */
    public void setKromo(String kromo) {
        this.kromo = kromo;
    }

    public int getAngka() {
        return angka;
    }

    public void setAngka(int angka) {
        this.angka = angka;
    }

    public int hitung(String a) {
        int kuncia = 0;
        for (int i = 0; i < getIndo().length(); i++) {
            char keyChar = getIndo().charAt(i);
            int kunci = (int) keyChar - (int) 'a' + 1;
            kuncia += kunci;
        }        
        return kuncia;
    }

}
