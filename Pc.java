package DIspositivo;

public class Pc extends Dispositivo{
    public String Marc_Tec;
    public Pc(String name, int RAM, String CPU,int SAL, String Marc_Tec) {
        super(name, RAM, CPU,SAL);
        this.Marc_Tec=Marc_Tec;
    }




    public void setMarc_Tec(String marc_Tec) {
        Marc_Tec = marc_Tec;
    }

    public String getMarc_Tec() {
        return Marc_Tec;
    }
    public void PWONNCAM(){
        System.out.println("Webcam Encendida: Estoy viendote");
    }
}
