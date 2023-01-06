import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AccountTest {
    @Test
    public void testSavingAccounts() {
        Account account = new Account(100, 0, "766", AccountType.SAVING);
        assertTrue(account.getBalance() == 100);
        assertTrue(account.getAccountNumber().equals("abc"));
        assertTrue(account.getId() == 0);


        Account account1 = new Account(11100, 1, "12345", AccountType.SAVING);
        assertTrue(account1.getAccountNumber().equals("abc"));
        assertTrue(account1.getBalance() == 11100);
        assertTrue(account1.getId() == 1);
//        assertTrue(account)
    }

    @Test
    public void testCheckingAccount() {
        Account account = new Account(100, 0, "abc", AccountType.CHEQUE);
        assertTrue(account.getBalance() == 100);
        assertTrue(account.getAccountNumber().equals("abc"));
        assertTrue(account.getId() == 0);


        Account account1 = new Account(11100, 1, "12345", AccountType.CHEQUE);
        assertTrue(account1.getAccountNumber().equals("abc"));
        assertTrue(account1.getBalance() == 11100);
        assertTrue(account1.getId() == 1);
    }
}
