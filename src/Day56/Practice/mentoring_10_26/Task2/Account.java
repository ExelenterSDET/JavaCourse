package Day56.Practice.mentoring_10_26.Task2;

public class Account {
    private String account;
    private String city;
    private int id;
    private double balance;

    public Account(String account, String city, int id, double balance) {
        this.account = account;
        this.city = city;
        this.id = id;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", city='" + city + '\'' +
                ", Accoint id=" + id +
                ", balance=" + balance +
                '}';
    }
}
