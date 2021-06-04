import java.util.Scanner;

public class Order implements NewOrder{
    private double total;
    private Part[] partes;
    private Client client;
    private Cashier cashier;
    public Order(Client client,Cashier cashier){
     this.client=client;
     this.cashier=cashier;
     this.setParts();
    }

    @Override
    public void setParts() {
        System.out.println("¿Cuantas partes quieres?");
        Scanner scanner=new Scanner(System.in);
        int cuantas=scanner.nextInt();
        partes=new Part[cuantas];
        for (int x=0; x<cuantas; x++){
            partes[x]= new Part("parte",200,"Tal");

        }
    this.setTotal();

    }

    @Override
    public void setClint() {

    }

    @Override
    public void setTotal() {
    for (int x1=0; x1< partes.length;x1++) {
        total = total + partes[x1].getPrice();
    }
    }

    public double getTotal() {
        return total;
    }
}
