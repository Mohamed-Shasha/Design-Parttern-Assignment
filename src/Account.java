import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Account {

    static ArrayList<Integer> checkingAccounts = new ArrayList<>();
    static ArrayList<Integer> savingAccounts = new ArrayList<>();
    private int accountNumber;

    public Account() {
        this.accountNumber = 0;
    }



    public int generateAccountNumber(ArrayList<Integer> accounts, String digit) {
        int a = new Random().nextInt(10000);
        while (accounts.contains(a)) {
            a = new Random().nextInt(10000);
        }
        if (String.valueOf(a).length() < 6) {
            String b = String.format("%05d", a);
            accountNumber = Integer.parseInt(digit + b);
        } else {
            accountNumber = Integer.parseInt(digit + a);
        }
        accounts.add(accountNumber);


        return accountNumber;
    }
}
