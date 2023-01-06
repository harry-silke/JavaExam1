public class Account {
    private double id;
//    private String name;
    private double balance;
//    private double checkingBalance;
    private String mobileNumber;
    private String accountNumber;
//    private String checkingAccountNumber;

    private AccountType accountType;

    public Account(double id){
        this.id = id;
    }

    public Account(double balance, double id, String accountNumber, AccountType type){
        this.balance = balance;
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = type;
    }

    public double getBalance() {
        return balance;
    }

    public double getId() {
        return id;
    }
//    public String getName(){
//        return name;
//    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setId(double id) {
        this.id = id;
    }
}



