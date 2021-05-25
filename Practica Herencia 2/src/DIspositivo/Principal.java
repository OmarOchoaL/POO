package DIspositivo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      int[] miArray=new int[5];
        Scanner scanner=new Scanner(System.in);
        Celular celulares[];
        Dispositivo dispositivos[];
        Pc PC[];
        Servidor servidor[];
        int SAL1 = 0;
        int SAL=0;
        int SAL3=0;
        int RAM1=0;
        int RAM=0;
        int RAM3=0;
        int ncc=0;
        int ncpc=0;
        int ncs=0;
        int opc=0;
        int cc;
        int cpc;
        int cs;
        while (opc!=5){
            System.out.println("      Bienvenido al Sistema    \n" +
                               "¿Que desea hacer: \n" +
                               "1) Crear Celular: \n"+
                               "2) Crear PC:      \n"+
                               "3) Crear Servidor: \n"+
                               "4) Funciones Especiales:  \n"+
                               "5) Salir ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("¿Cuantos celulares desea crear? ");
                    cc = scanner.nextInt();
                    celulares = new Celular[cc];
                    for (int x = 0; x < cc; x++) {
                        ncc = ncc + 1;
                        System.out.println("Inserte el nombre del celular " + ncc + " : ");
                        String name1 = scanner.next();
                        System.out.println("Inserte la memoria RAM del celular " + ncc + " : ");
                         RAM1 = scanner.nextInt();
                        System.out.println("Inserte el procesador");
                        String CPU1=scanner.next();
                        System.out.println("Introduzca el saldo del celular " +ncc + " : ");
                        SAL1=scanner.nextInt();
                        Celular celular1=new Celular(name1,RAM1,CPU1,SAL1);
                        celulares[x]= celular1;

                    }
                    System.out.println("Se guardaron los datos");
                    break;

                case 2:
                    System.out.println("¿Cuantas PC desea crear? ");
                    cpc= scanner.nextInt();
                    PC = new Pc[cpc];
                    for (int x1=0;x1<cpc;x1++){
                        ncpc=ncpc+1;
                        System.out.println("Inserte el nombre de la PC " +ncpc + " : ");
                        String name=scanner.next();
                        System.out.println("Inserte la memoria RAM de la PC " +ncpc +" : ");
                        RAM=scanner.nextInt();
                        System.out.println("Inserte el procesador de la PC " +ncpc +" : ");
                        String CPU=scanner.next();
                        System.out.println("Introduzca el saldo de la PC " +ncpc +" : ");
                        SAL = scanner.nextInt();
                        System.out.println("Inserte la marca del teclado " +ncpc+ " : ");
                        String MARC_TEC=scanner.next();
                        Pc pc=new Pc(name,RAM,CPU,SAL,MARC_TEC);
                        PC[x1]=pc;
                    }
                    System.out.println("Se guardaron los datos");
                    break;

                case 3:
                    System.out.println("¿Cuantos servidores desea crear? ");
                    cs=scanner.nextInt();
                    servidor=new Servidor[cs];
                    for (int x2 = 0; x2 < cs; x2++){
                        ncs=ncs+1;
                        System.out.println("Inserte el nombre del Servidor " + ncs+ " : ");
                        String name3=scanner.next();
                        System.out.println("Inserte la memoria RAM del Servidor " +ncs+ " : ");
                        RAM3= scanner.nextInt();
                        System.out.println("Inserte el Procesador del Servidor " +ncs+ " : ");
                        String CPU3= scanner.next();
                        System.out.println("Introduzca el saldo del Servidor " +ncs+ " : ");
                        SAL3= scanner.nextInt();
                        System.out.println("Introduzca zona Horaria "+ ncs+ " : ");
                        String ZonHor3= scanner.next();
                        Servidor servidor1=new Servidor(name3,RAM3,CPU3,SAL3,ZonHor3);
                        servidor[x2]=servidor1;
                    }
                    System.out.println("Se guardaron los datos");
                    break;
                case 4:
                    int opc2=0;
                    System.out.println("    ¿Que función especial desea ejecutar?   \n"+
                                       "1) Enviar SMS  \n"+
                                       "2) Encender Webcam  \n"+
                                       "3) Aumentar RAM \n");
                    opc2=scanner.nextInt();
                    switch (opc2){
                        case 1:
                            int opc3=0;
                            System.out.println("Elija su dispositivo con saldo: \n"+
                                               "1) Celular \n"+
                                               "2) Pc  \n"+
                                               "3) Servidor ");
                            opc3=scanner.nextInt();
                            switch (opc3) {
                                case 1:
                                System.out.println("¿Que desea preguntar? ");
                                String pre= scanner.next();
                                   SAL1= SAL1-1;
                                    System.out.println("Su saldo es: " +SAL1);
                                break;
                                case 2:
                                    System.out.println("¿Que desea preguntar? ");
                                    String pre2=scanner.next();
                                    SAL=SAL-1;
                                    System.out.println("Su saldo es: " +SAL);
                                    break;
                                case 3:
                                    System.out.println("¿Que desea preguntar? ");
                                    String pre3=scanner.next();
                                    SAL3=SAL3-1;
                                    System.out.println("Su saldo es: " +SAL3);
                                    break;
                                default:{
                                    System.out.println("No hay otros dispositivos, porfavor elija uno de los disponibles.");
                                }

                            }
                            break;
                        case 2:
                            Pc pc1=new Pc("Asuss",4096,"Intel",100,"Free");
                            pc1.PWONNCAM();
                            break;


                        case 3:
                            System.out.println("¿A que dispositivo desea agregarle RAM? \n"+
                                               "1) Celular \n"+
                                               "2) Pc   \n"+
                                               "3) Servidor");
                            int opc4= scanner.nextInt();
                            switch (opc4) {
                                case 1:
                                System.out.println("¿Cuanta memoria RAM desea agregar? ");
                                int ARAM = scanner.nextInt();
                                ARAM=RAM1+ARAM;
                                    System.out.println("Ah aumenta su RAM a: " + ARAM);
                                break;
                                case 2:
                                    System.out.println("¿Cuanta memoria RAM desea agregar? ");
                                    int ARAM1 = scanner.nextInt();
                                    ARAM1=RAM+ARAM1;
                                    System.out.println("Ah aumenta su RAM a: " + ARAM1);
                                    break;
                                case 3:
                                    System.out.println("¿Cuanta memoria RAM desea agregar? ");
                                    int ARAM2 = scanner.nextInt();
                                    ARAM2=RAM3+ARAM2;
                                    System.out.println("Ah aumenta su RAM a: " + ARAM2);
                                    break;
                                default:{
                                    System.out.println("No hay ese dispositivo, favor de elegir uno de los disponibles");
                                }
                            }
                            break;
                        default: {
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Adios gracias por usar el sistema");
                    break;

                default:{
                    System.out.println("Opción no valida");
                }

            }

        }
    }
}
