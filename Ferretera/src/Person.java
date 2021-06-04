public abstract class Person {
    private String nombre;
    private String adress;
    private String phone;
    public Person (String nombre, String adress, String phone){
        this.nombre=nombre;
        this.adress=adress;
        this.phone=phone;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void setAdress(String adress) { this.adress = adress; }

    public String getAdress() { return adress; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getPhone() { return phone; }

}
