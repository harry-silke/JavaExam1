import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ATM {

//map for users and their id

    Map<Integer, User> users;
// creates a hashmap of users and their id
    public ATM() {
        users = new HashMap<>();
    }

    // is the main function that governs the code base - the ATM function is run out of this
    public void interactATM() {
        Scanner scanner = new Scanner(System.in);

 // checks if the function is still progressing and runs code accordingly using a while (true) loop

        boolean alive = true;
        boolean dead = false;
        User user = null;


              while (alive) {


            System.out.println("Please Enter you User ID");
//                  sout("account number?")
                  // asks user for their account number
            int id;
            // checks if the code is still progressing - also checks if the user use q
            try {
                id = scanner.nextInt();
            } catch (InputMismatchException e) {
                alive = false;
                System.out.println("Account balances:");
                System.out.println("Savings: " + user.getSavingsAccount().getBalance());
                System.out.println("Checking: " + user.getCheckingAccount().getBalance());

//                make sure this breaks
                break;

            }
            // finds what user they are and makes them the current user
            user = users.get(id);
            if (user == null) {
                System.out.println("Wrong Input: Invalid Account Number");
            }
            // welcomes user and asks what they want to do
            System.out.println("Welcome " + user.getFirstname() + " " + user.getLastname() + "!");
         // asks user what option they want to do
            System.out.println("Select an option: 1) Deposit 2) Withdraw 3) Balance 4) Quit");
            int option;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                alive = false;
                System.out.println("Account balances:");
                System.out.println("Savings: " + user.getSavingsAccount().getBalance());
                System.out.println("Checking: " + user.getCheckingAccount().getBalance());
//                make sure this breaks
                break;

            }

//            String optionToQuit = scanner.nextLine();  // consume the newline character
//            if (option == 4) {
//                System.out.println("Account balances:");
//                System.out.println("Savings: " + user.getSavingsAccount().getBalance());
//                System.out.println("Checking: " + user.getCheckingAccount().getBalance());
//            }


//            System.out.println(user.getCheckingAccount().getBalance());
//            System.out.println("Select an account: 1) Checking: " + user.getCheckingAccount().getAccountNumber() + " 2) Savings: " + user.getSavingsAccount().getAccountNumber());
//            int accountType = scanner.nextInt();
//            scanner.nextLine();
// Function that controls what happens after user selects what to do
                  // 1 - deposit
                  // 2 - Withdram
                  // 3 - balance
                  // 4 - quit
                  // use if and if else
            if (option == 1) {
                System.out.println("Select an account: 1) Checking: " + user.getCheckingAccount().getAccountNumber() + " 2) Savings: " + user.getSavingsAccount().getAccountNumber());
                int accountType = scanner.nextInt();
                scanner.nextLine();

                System.out.println("How much would you like to deposit?");
                double deposit = scanner.nextDouble();

//                add in deposit
                if (accountType == 1) {
                    double balance = user.getSavingsAccount().getBalance() + deposit;
                    user.getSavingsAccount().setBalance(balance);
                } else if (accountType == 2) {
                    double balance = user.getCheckingAccount().getBalance() + deposit;
                    user.getCheckingAccount().setBalance(balance);
                }

// is the withdraw function - needs to check for amount of money in account
            } else if (option == 2) {
                System.out.println("Select an account: 1) Checking: " + user.getCheckingAccount().getAccountNumber() + " 2) Savings: " + user.getSavingsAccount().getAccountNumber());
                int accountType = scanner.nextInt();
                scanner.nextLine();

                // prompt them to enter the amount to withdrawm
                System.out.println("How much would you like to withdraw?");
                double withdraw = scanner.nextDouble();
                // ensure they have enough money
                if (accountType == 1) {
                    if (withdraw > user.getSavingsAccount().getBalance()) {
                        System.out.println("Wrong Input: Insufficient Funds");
                        continue;
                    }
                    double balance = user.getSavingsAccount().getBalance() - withdraw;
                    user.getSavingsAccount().setBalance(balance);
                }
                // for checking account
                if (accountType == 2) {
                    if (withdraw > user.getCheckingAccount().getBalance()) {
                        System.out.println("Wrong Input: Insufficient Funds");
                        continue;
                    }
                    double balance = user.getCheckingAccount().getBalance() - withdraw;
                    user.getCheckingAccount().setBalance(balance);
                } else if (option == 3) {
                    System.out.println("Which account would you like to know the balance: 1) for checking 2) for saving");
                    int account = scanner.nextInt();
                    scanner.nextLine();

                    if (account == 1) {
                        System.out.println(user.getCheckingAccount().getBalance() + "Checking account balance");
                    }
                    if (account == 2) {
                        System.out.println(user.getSavingsAccount().getBalance() + "Savings account balance");
                    }

                }

                // withdraw from account
            } else if (option == 3) {
                System.out.println(user.getCheckingAccount().getBalance());
                System.out.println("Select an account: 1) Checking: " + user.getCheckingAccount().getAccountNumber() + " 2) Savings: " + user.getSavingsAccount().getAccountNumber());
                int accountType = scanner.nextInt();
                scanner.nextLine();

                if (accountType == 1) {
                    System.out.println("Balance: " + user.getSavingsAccount().getBalance());
                } else if (accountType == 2) {
                    System.out.println("Balance: " + user.getCheckingAccount().getBalance());
                }
            }

        }

    }

    public boolean addUser() {
        return false;
    }


    public boolean loadAccounts(String fileName) {
        //loads accounts from files
        Path current = Paths.get(".");
        System.out.println(current.toAbsolutePath());
        if (users.size() == 0) {
            return false;
        }

        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                // use three pipes as separator
                System.out.println(line);
                String[] values = line.split("\\|\\|\\|");
                int id = Integer.parseInt(values[0]);
                String accountNumber = values[1];
                String accountType = values[2];
                System.out.println(values[3]);
                double accountBalance = Double.parseDouble(values[3]);
                User currentUser = users.get(id);
//                what accountType
                if (accountType.equals("Saving")) {
                    currentUser.createAccount(AccountType.SAVING, accountBalance, id, accountNumber);
                } else if(accountType.equals("Cheque")) {
                    currentUser.createAccount(AccountType.CHEQUE, accountBalance, id, accountNumber);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean loadUsers(String fileName) {
        // loads users from files
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] values = line.split(",");
                int id = 0;
                if (!values[3].equals("AccountOwnerID")){
                    id = Integer.parseInt(values[3]);
                    System.out.println(id + "id");
                    User user = new User(values[0], values[1], values[2], id);
                    users.put(id, user);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }


}
