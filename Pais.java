package ZonaGeografica;

public class Pais extends ZonaGeografica {
    private String idioma;
    private String moneda;
    private String presi;

public Pais(String name,double superfi, String idioma, String moneda, String presi){
      super(name,superfi);
      this.idioma=idioma;
      this.moneda=moneda;
      this.presi=presi;
}

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setPresi(String presi) {
        this.presi = presi;
    }

    public String getPresi() {
        return presi;
    }

}
