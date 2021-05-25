package DIspositivo;

public class Celular extends Dispositivo{
    public String enviarSMS;
    public Celular(String name, int RAM, String CPU,int SAL,String enviarSMS) {
        super(name, RAM, CPU,SAL);
        this.enviarSMS=enviarSMS;

    }

    public Celular(String name1, int ram1, String cpu1, int sal1) {
        super(name1,ram1,cpu1,sal1);
    }


    public void setEnviarSMS(String enviarSMS) {
        this.enviarSMS = enviarSMS;
    }

    public String getEnviarSMS() {
        return enviarSMS;
    }
    public void enviarSMS(){
        System.out.println("1) Enviar SMS");
    }
}
