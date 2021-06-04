public class Client extends Person{
    private double credit;
    private double max_credit;
    public Client(String nombre, String adress, String phone, double credit,double max_credit) {
        super(nombre, adress, phone);
        this.credit=credit;
        this.max_credit=max_credit;
    }

    public void setCredit(double credit) { this.credit = credit; }

    public double getCredit() { return credit; }

    public void setMax_credit(double max_credit) { this.max_credit = max_credit; }

    public double getMax_credit() { return max_credit; }

}
