public class TestAccount {
    public static void main (String[] args) {
        //init Account objects
        Account Acc1 = new Account("Acc1", "Acc1", 5000);
        Account Acc2 = new Account("Acc2", "Acc2", 4000);

        //print account balances:
        System.out.println("    Account balances");
        System.out.println("Acc1: $" + Acc1.getBalance());
        System.out.println("Acc2: $" + Acc2.getBalance());

        //transfer balance
        System.out.println("   Account Transfer");
        Acc1.transferTo(Acc2, 1000);
        System.out.println("Transfer of 1000 from Acc1 to Acc2");

        //Display new Balances
        System.out.println(Acc1.toString());
        System.out.println(Acc2.toString());
    }
}
