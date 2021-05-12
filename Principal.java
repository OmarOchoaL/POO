package ZonaGeografica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] miArray = new int[4];
        int nzc = 0;
        int npc=0;
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[0];
        String[] str2 = new String[0];
        miArray[0] = 100;
        miArray[3] = 200;
        int opc;
        int cz;
        int pc;
        do {
            System.out.println("      Bienvenido usuario   ");
            System.out.println("¿Que desea hacer?   1) Crear zona geografica" +
                    " 2) Crear Provincias " +
                    " 3) Mostrar" +
                    " 4) Salir");
            opc = scanner.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("¿Cuantas zonas desea crear? ");
                    cz = scanner.nextInt();
                    str = new String[cz];
                    for (int x1 = 0; x1 < cz; x1++) {
                        nzc = nzc + 1;
                        System.out.println("Insertar nombre de la zona " + nzc);
                        String n = scanner.next();
                        System.out.println("Insertar la superficie " + nzc);
                        String s = scanner.next();
                        str[x1] = "Zona " + nzc + ": " + n + " con " + s + " Km";
                    }
                    break;
                case 2:

                    System.out.println("¿Cuantas provincias desea crear? ");
                    pc = scanner.nextInt();
                    str2 = new String[pc];
                    for (int x = 0; x < pc; x++) {
                        npc=npc+1;
                        System.out.println("Insertar el idioma " + npc);
                        String id = scanner.next();
                        System.out.println("Insertar la moneda " + npc);
                        String mo = scanner.next();
                        System.out.println("Insertar el presidente actual " + npc);
                        String pre = scanner.next();
                        str2[x] ="Pais "+npc+ " Con; "+" Idioma: "+id +" con una moneda de: "+mo +" con su presidente: " +pre;
                    }
                    break;
                case 3:
                    System.out.println(" Estos fueron los datos creados ");
                    ArregloZona1(str);
                    ArregloProv(str2);
                    break;


                case 4:
                    System.out.println("Adios gracias por usarme");
                    break;

                default:
                    System.out.println("No sirvo con ese numero. Elige uno de los asignados");


            }
        } while (opc <= 3);

    }
    public static void ArregloZona1 (String[]arr){
        for (int x1 = 0; x1 < arr.length; x1++) {
            System.out.println(arr[x1]);
        }
    }
    public static void ArregloProv (String[]arr){
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }


}

