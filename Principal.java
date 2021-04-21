public class Principal {
    public static void main(String [] args){
        System.out.println("jasdh");

        Planet tierra = new Planet("Tierra", 1500 , "Solid", 365, 5454);
        Planet mercurio= new Planet("Mercurio", 146, "Solid" , 240, 632);
        System.out.println(tierra.getName());
        System.out.println(mercurio.getName());
        tierra.setName("Earth");
        System.out.println(tierra.getName());

        Asteroid destructor= new Asteroid("Destructor", 800, "Solid", 66.20);
        Asteroid saitama= new Asteroid("Saitama", 6215, "Solid", 58.20);
        Asteroid vulcan= new Asteroid("Vulcan", 7512, "Solid", 654.00);

    }

}
