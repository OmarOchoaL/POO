package DIspositivo;

public class Dispositivo {
    private String name;
    private int RAM;
    public String CPU;
    public int SAL;
    public Dispositivo(String name,int RAM, String CPU,int SAL){
        this.name=name;
        this.RAM=RAM;
        this.CPU=CPU;
        this.SAL=SAL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getRAM() {
        return RAM;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getCPU() {
        return CPU;
    }

    public void setSAL(int SAL) {
        this.SAL = SAL;
    }

    public int getSAL() {
        return SAL;
    }
    public void cargarSaldo(int SAL1){
        this.SAL=this.SAL + SAL1;
    }

    public void ONN(){
        System.out.println("Encendiendo dispositivo: ....");
    }
    public void OFF(){
        System.out.println("Apagando Dispositivo: .....");
    }

}
