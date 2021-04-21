
public class Asteroid {
    private String name;
    public double distance_of_earth;
    private String composition;
    private double speed;


    //CONSTRUCCTOR
    public Asteroid( String nombre, double d, String c, double s){
        this.name=nombre;
        this.distance_of_earth=d;
        this.composition=c;
        this.speed=s;


    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setDistance_of_earth(double distance_of_earth){
        this.distance_of_earth=distance_of_earth;
    }
    public double getDistance_of_earth(){
        return this.distance_of_earth;
    }
    public void setComposition (String composition){
        this.composition=composition;
    }
    public String getComposition(){
        return this.composition;
    }
    public void setSpeed(double speed){
        this.speed=speed;
    }
    public double getSpeed(){
        return this.speed;
    }
}