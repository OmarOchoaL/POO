package ZonaGeografica;

public class ZonaGeografica {
private String name;
private double superfi;

   public ZonaGeografica(String name,double superfi){
           this.name=name;
           this.superfi=superfi;

   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSuperfi(double superfi) {
        this.superfi = superfi;
    }

    public double getSuperfi() {
        return superfi;
    }
}
