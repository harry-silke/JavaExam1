import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
// loads data and function from ATM
        ATM atm = new ATM();
        atm.loadUsers("data/users.txt");
//        System.out.println(atm.loadUsers("users.txt"));
        atm.loadAccounts("data/accounts.txt");

        atm.interactATM();


    }

}