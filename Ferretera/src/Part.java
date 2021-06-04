public class Part {
    private String name;
    private double price;
    private String brand;
    public Part(String name,double price,String brand){
        this.name=name;
        this.price=price;
        this.brand=brand;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setPrice(double price) { this.price = price; }

    public double getPrice() { return price; }

    public void setBrand(String brand) { this.brand = brand; }

    public String getBrand() { return brand; }

}
