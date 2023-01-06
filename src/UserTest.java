import org.junit.Test;

public class UserTest {

    @Test
    public void createAccount(){
        Account account = new Account (100 ,1 , "2345", AccountType.SAVING);
        Account account1 = new Account (112233 ,2 , "23456", AccountType.CHEQUE);
        Account account3 = new Account (12 ,3 , "12345245", AccountType.SAVING);

    }

    @Test
    public void userTests(){
        User user = new User("a","b","123",1);
        User user1 = new User("mike","b","1233",2);

    }

}
