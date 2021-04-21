public class Planet {
    private String name;
    private double sun_distance1;
    private String composition1;
    private int orbit_days1;
    public double mass1;

    //CONSTRUCCTOR
    public Planet( String nombre, double d, String c, int o, double m){
        this.name=nombre;
        this.sun_distance1=d;
        this.composition1=c;
        this.orbit_days1=o;
        this.mass1=m;
    }

    public void setName(String nuevoNombre){
        this.name=nuevoNombre;
    }
    public String getName(){
        return this.name;
    }
    public void setSun_distance1 (double sun_distance1){
        this.sun_distance1=sun_distance1;
    }
    public double getSun_distance1(){
        return this.sun_distance1;
    }
    public void setComposition1 (String composition1){
        this.composition1=composition1;
    }
    public String getComposition1(){
        return this.composition1;
    }
    public void setOrbit_days1(int orbit_days1){
        this.orbit_days1=orbit_days1;
    }
    public int getOrbit_days1(){
        return this.orbit_days1;
    }
    public void setMass1(double mass1){
        this.mass1=mass1;
    }
    public double getMass1(){
        return this.mass1;
    }
}
