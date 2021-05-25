package DIspositivo;

import java.util.Scanner;

public class Servidor extends Dispositivo{
     Scanner scanner=new Scanner(System.in);

      public int ZonHor;
     public Servidor(String name3, int RAM3, String CPU3,int SAL3,int ZonHor3) {
          super(name3, RAM3, CPU3,SAL3);

          this.ZonHor=ZonHor3;
     }

     public Servidor(String name3, int ram3, String cpu3, int sal3, String zonHor3) {
          super(name3,ram3,cpu3,sal3);
     }


     public void setZonHor(int zonHor) {
          ZonHor = zonHor;
     }

     public int getZonHor() {
          return ZonHor;
     }
     public void aumentarRAM(){
          System.out.println("Cuanta RAM desea añadir: ");
          int ARAM=scanner.nextInt();
     }
}
