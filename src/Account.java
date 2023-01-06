public class Account {

    //Declare variables that are a part of users accounts
    private double id;
//    private String name;
    private double balance;
//    private double checkingBalance;
    private String mobileNumber;
    private String accountNumber;
//    private String checkingAccountNumber;

    private AccountType accountType;
// function that gets the id from the account
    public Account(double id){
        this.id = id;
    }
// constructor function toi initialise a new account
    public Account(double balance, double id, String accountNumber, AccountType type){
        this.balance = balance;
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = type;
    }
// returns balance of account
    public double getBalance() {
        return balance;
    }
// function that returns the id from the account
    public double getId() {
        return id;
    }
// function that retrieves the account number
    public String getAccountNumber() {
        return accountNumber;
    }
    // function that retrieves the mobile number
    public String getMobileNumber(){
        return mobileNumber;
    }
//    function that enables you to change the balance
    public void setBalance(double balance){
        this.balance = balance;
    }
// function that enables you to change or declare the account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
// function that enables you to change or declare the id

    public void setId(double id) {
        this.id = id;
    }
}



