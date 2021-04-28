import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args){

/*
        Planet tierra = new Planet("Tierra", 1500 , "Solid", 365, 5454);
        Planet mercurio= new Planet("Mercurio", 146, "Solid" , 240, 632);
        System.out.println(tierra.getName());
        System.out.println(mercurio.getName());
        tierra.setName("Earth");
        System.out.println(tierra.getName());

        Asteroid destructor= new Asteroid("Destructor", 800, "Solid", 66.20);
        Asteroid saitama= new Asteroid("Saitama", 6215, "Solid", 58.20);
        Asteroid vulcan= new Asteroid("Vulcan", 7512, "Solid", 654.00);
 */

        int op=0;
        Scanner scanner=new Scanner(System.in);
        while(op !=4){
            System.out.println("¿Qué decea hacer?\n 1)Crear Estrella \n 2)Crear Asteroide \n 3) Crear Planeta \n 4)Salir");
            op=scanner.nextInt();
            switch (op){
                case 1:{
                    //Crear Estrella
                    System.out.println("Introduce el diametro: ");
                    double d=scanner.nextDouble();
                    System.out.println("El tipo de la estrella:  1)Enana roja 2)Enana Blanca");
                    int t=scanner.nextInt();
                    String tipo="";
                    if(t == 1){
                        tipo="Enana roja";
                    }else if (t == 2){
                        tipo="Enana Blanca";
                    }else{
                        tipo="Estrella Normal";
                    }
                    System.out.println("El color de la estrella es:  1)Roja 2)Azul");
                    int c=scanner.nextInt();
                    Color color=Color.BLACK;
                    if(c == 1){ color=Color.RED; }else if(c == 2){ color=Color.BLUE;}
                    Star estrella1=new Star(d,tipo,color);
                    System.out.println("La estrella que creaste es: Diametro: "+estrella1.getDiameter()
                    +" de Tipo:"+estrella1.getType()+" de Color: "+estrella1.getColor().toString());
                    break;
                }
                case 2:{
                    //Crear Asteroide
                    System.out.println("¿Cual es su nombre? ");
                    String n=scanner.next();
                    System.out.println("¿Cual es su distancia sobre la tierra?  ");
                    double de=scanner.nextDouble();
                    System.out.println("¿Cual es su composición?  1) Solido  2) Liquido  3) Gaseoso ");
                    int comp=scanner.nextInt();
                    String composi="";
                    if(comp == 1){
                        composi="Solido";
                    }else if(comp == 2){
                        composi="Liquido";
                    }else if(comp == 3){
                        composi="Gaseoso";
                    }else{
                        composi="No se sabe";
                    }
                    System.out.println("¿Cual es su velocidad?  ");
                    double sp=scanner.nextDouble();
                    Asteroid asteroide1=new Asteroid(n,de,composi,sp);
                    System.out.println("El asteroide: "+asteroide1.getName()+
                            "  tiene una distancia de la tierra de: "+asteroide1.getDistance_of_earth()+
                            "  Con una composición: "+asteroide1.getComposition()+ "   Con una velocidad de: "+asteroide1.getSpeed());

                    break;
                }
                case 3:{
                    //Crear Planeta
                    System.out.println("¿Cual es el nombre: ");
                    String n1=scanner.next();
                    System.out.println("¿Cual es la ditancia sobre el sol: ");
                    double ds= scanner.nextDouble();
                    System.out.println("¿Cual es su composición?  1) Solido  2) Gasesoso  3) Liquido");
                    int comp1=scanner.nextInt();
                    String composi1="";
                    if (comp1 == 1){
                        composi1="Solido";
                    }else if (comp1 == 2){
                        composi1="Gaseoso";
                    }else if (comp1 == 3){
                        composi1="Liquido";
                    }else{
                        composi1="No se sabe";
                    }
                    System.out.println("Días de orbita:  ");
                    int dyaso=scanner.nextInt();
                    System.out.println("¿Cual es la masa?  ");
                    double mas=scanner.nextDouble();
                    Planet planet1=new Planet(n1,ds,composi1,dyaso,mas);
                    System.out.println("El Planeta:  "+planet1.getName()+
                            "  Tiene una distancia hacia el sol de:  "+planet1.getSun_distance1()+
                            "  Con una composición:  "+planet1.getComposition1()+
                            "  Sus días de orbita son:  "+planet1.getOrbit_days1()+
                            "  Con una masa de:  "+planet1.getMass1());


                    break;
                }
                case 4:{
                    break;
                }
                default: {
                    System.out.println("Opcion no valida");
                }
            }//Llave switch
        }//Llave while
        System.out.println("Gracias por utilizar el sistema");
    }//Llave main

}//Llave class
