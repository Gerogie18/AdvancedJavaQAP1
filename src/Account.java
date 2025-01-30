public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructors
    public Account() {
        this.id = "No ID";
        this.name = "No Name";
        this.balance = 0;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Credit method
    public int credit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Credit Must be positive number");
        }
        return balance;
    }

    // Debit method
    public int debit(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount Exceeded Balance");
        }
        return balance;
    }

    // TransferTo method
    public int transferTo(Account another, int amount) {
        if (balance >= amount) {
            balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount Exceeded Balance");
        }
        return balance;
    }

    // toString method
    public String toString() {
        return "Account[id: " + id + ", Name: " + name + ", Balance: " + balance + "]";
    }
}