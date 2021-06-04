public class Principal {
    public static void main(String[] args) {
        Admin admin1=new Admin("admin","pinocho","633","admin","123");
        Cashier cashier1=new Cashier("cajero1","qwrt","654898","c1","123");
        cashier1.makePayment();
        User cashier2=new Cashier("cajero1","qwrt","654898","c1","123");

        Client client=new Client("Jose","Tal","1354",0,200);
        Order order1=new Order(client,cashier1);
        System.out.println(order1.getTotal());
    }
}
