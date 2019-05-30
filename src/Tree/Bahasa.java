package Tree;

public class Bahasa {

    private String indo;
    private String ngoko;
    private String krama;
    private String kramaInggil;

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
     * @return the krama
     */
    public String getKrama() {
        return krama;
    }

    /**
     * @param krama the krama to set
     */
    public void setKrama(String krama) {
        this.krama = krama;
    }

    public String getKramaInggil() {
        return kramaInggil;
    }

    public void setKramaInggil(String kramaInggil) {
        this.kramaInggil = kramaInggil;
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
