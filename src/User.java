public class User {
    // user needs to have id, name, balance saving, balance checking, mobile.
    private int id;
    private String firstname;
    private String lastname;

    private Account savingsAccount;
    private Account checkingAccount;
    private String mobileNumber;
    private String savingsAccountNumber;
    private String checkingAccountNumber;

    public User(String firstname, String lastname, String mobileNumber, int id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.mobileNumber=mobileNumber;
        this.id=id;
    }

    public User( int id, String firstname, String lastname, String mobileNumber, double savingsBalance, String savingsAccountNumber,  double checkingBalance, String checkingAccountNumber){
        this.id = id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.savingsAccount = new Account(savingsBalance, id, savingsAccountNumber, AccountType.SAVING);
        this.checkingAccount = new Account(checkingBalance, id, checkingAccountNumber, AccountType.CHEQUE);
        this.mobileNumber = mobileNumber;
        this.checkingAccountNumber = checkingAccountNumber;
        this.savingsAccountNumber = savingsAccountNumber;
    }

    public int getID(){
        return id;
    }
//    public String getName(){
//        return name;
//    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }

    public void setSavingBalance(double balance){
        savingsAccount.setBalance(balance);
    }
    public void setChequingBalance( double balance){
        checkingAccount.setBalance(balance);
    }
    public Account getSavingsAccount(){
        return savingsAccount;
    }
    public Account getCheckingAccount(){
        return checkingAccount;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getSavingsAccountNumber(){
        return savingsAccountNumber;
    }
    public String getCheckingAccountNumber(){
        return checkingAccountNumber;
    }

//    public void setName(String name){
//        this.fr = name;
//    }
    public void setSavingsAccount(Account savingsAccount){
        this.savingsAccount = savingsAccount;
    }

    public void setCheckingAccount(Account checkingAccount){
        this.checkingAccount = checkingAccount;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public void setID (int id){
        this.id = id;
    }
    public void setSavingsAccountNumber(String savingsAccountNumber){
        this.savingsAccountNumber = savingsAccountNumber;
    }
    public void setCheckingAccountNumber(String checkingAccountNumber){
        this.checkingAccountNumber = checkingAccountNumber;
    }


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
