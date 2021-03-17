import java.util.Scanner;

//Realizo......OMAR TADEO OCHOA LOZANO
public class Principal {


    public static void main(String[] args) {
      short x1=1;
      int x2=6;
      short x3=12;
      boolean entro=false;
      String texto="Hola Mundo";

      int numero=10;
      int numero2=6;
    int res=numero2++*2;


    int x=0;  // = asignar == comparar !false != <>  <= >=
    for(int j=0; j<100; j=j+10){
        System.out.println("Numero " + (j+1) );
    }
    int ciclo=0;
    while(ciclo<10){
        System.out.println(ciclo);
        ciclo++;
    }

        Scanner scanner=new Scanner(System.in);
    System.out.println("INTRODUCE TU EDAD:");
    int edad=scanner.nextInt();
    System.out.println("Has vivido " + (edad * 365)+ " días");
    System.out.println("Cuantas veces quieres imprimir: ");
    int veces=scanner.nextInt();
    for(int j=0; j<veces; j++){
        System.out.println("HOLA");
    }
    }
}
