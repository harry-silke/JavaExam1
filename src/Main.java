import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ATM atm = new ATM();
        atm.loadUsers("users.txt");
//        System.out.println(atm.loadUsers("users.txt"));
        atm.loadAccounts("accounts.txt");

        atm.interactATM();


    }

}