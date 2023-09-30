public class Accounts {
    public int getId() {
        return id;
    }

    private int id;
    private int pin;
    private String name;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String email;
    private double balance;

    public Accounts(int id, int pin, String name, String email, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.email = email;
        this.balance = balance;
    }
}
