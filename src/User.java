public class User {
    // user needs to have id, name, balance saving, balance checking, mobile.
    // Declare variables for users first and last name, their different accounts,
//    their mobile numbers and their account numbers
    // private int id;
    private int id;
    private String firstname;
    private String lastname;

    private Account savingsAccount;
    private Account checkingAccount;
    private String mobileNumber;
    private String savingsAccountNumber;
    private String checkingAccountNumber;


    // Constructor function to initialize a new User object
    // public user (parameters) { this.firstname = firstname}
    public User(String firstname, String lastname, String mobileNumber, int id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.mobileNumber=mobileNumber;
        this.id=id;
    }
    // Constructor function to initialize a new User object

//    public User( int id, String firstname, String lastname, String mobileNumber, double savingsBalance, String savingsAccountNumber,  double checkingBalance, String checkingAccountNumber){
//        this.id = id;
//        this.firstname=firstname;
//        this.lastname=lastname;
//        this.savingsAccount = new Account(savingsBalance, id, savingsAccountNumber, AccountType.SAVING);
//        this.checkingAccount = new Account(checkingBalance, id, checkingAccountNumber, AccountType.CHEQUE);
//        this.mobileNumber = mobileNumber;
//        this.checkingAccountNumber = checkingAccountNumber;
//        this.savingsAccountNumber = savingsAccountNumber;
//    }

//    public String getName(){
//        return name;
//    }
//function to get ID
public int getID(){
    return id;
}

//    function to get firstName
// getFirstName {this.firstName = firstName}
    public String getFirstname(){
        return firstname;
    }

    //function to get lastName
    public String getLastname(){
        return lastname;
    }
//function to change saving balance
    // public void setbalance (double balance ) { balance.setbalance(balance)}
    public void setSavingBalance(double balance){
        savingsAccount.setBalance(balance);
    }
    //function to change checking balance

    public void setChequingBalance( double balance){
        checkingAccount.setBalance(balance);
    }
    // Function that gets the savings account
    public Account getSavingsAccount(){
        return savingsAccount;
    }
// Function that gets the checking account
        public Account getCheckingAccount(){
        return checkingAccount;
    }
// function to get mobile number
    public String getMobileNumber(){
        return mobileNumber;
    }

    // functions that get the savings and checking account numbers
    public String getSavingsAccountNumber(){
        return savingsAccountNumber;
    }
    public String getCheckingAccountNumber(){
        return checkingAccountNumber;
    }

    //functions to change the savings and checking account
    public void setSavingsAccount(Account savingsAccount){
        this.savingsAccount = savingsAccount;
    }

    public void setCheckingAccount(Account checkingAccount){
        this.checkingAccount = checkingAccount;
    }
    // function to change the mobile number
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
//function to change id
    public void setID (int id){
        this.id = id;
    }
    // function to change cheque and savings account number
    public void setSavingsAccountNumber(String savingsAccountNumber){
        this.savingsAccountNumber = savingsAccountNumber;
    }
    public void setCheckingAccountNumber(String checkingAccountNumber){
        this.checkingAccountNumber = checkingAccountNumber;
    }

// initialize a new account
    public Account createAccount(AccountType type, double balance, double id, String accountNumber){
        Account newAccount = new Account(balance, id, accountNumber, type);
        if (type == AccountType.SAVING){
            this.savingsAccount = newAccount;
            return this.savingsAccount;
        }

        if (type == AccountType.CHEQUE) {
            this.checkingAccount = newAccount;
            return this.checkingAccount;
        }
        return newAccount;
    }


}
