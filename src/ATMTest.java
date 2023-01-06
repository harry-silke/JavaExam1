import org.junit.Test;

import static org.junit.Assert.assertTrue;

class ATMTest {
    @Test
    public void testCreateObjects(){
        ATM atm = new ATM();
        atm.loadUsers("users.txt");
//        System.out.println(atm.loadUsers("users.txt"));
        atm.loadAccounts("accounts.txt");

        assertTrue(atm.users.get(001).getID()==001);
        assertTrue(atm.users.get("John").getFirstname() == "John");
        assertTrue(atm.users.get("Smith").getLastname() == "Smith");
        assertTrue(atm.users.get("0403715629").getMobileNumber() == "0403715629");

        assertTrue(atm.users.get(002).getID()==002);
        assertTrue(atm.users.get("Leanne").getFirstname() == "Leanne");
        assertTrue(atm.users.get("Smith").getLastname() == "Smith");
        assertTrue(atm.users.get("0403185031").getMobileNumber() == "0403185031");

        assertTrue(atm.users.get(003).getID()==003);
        assertTrue(atm.users.get("Kim").getFirstname() == "Kim");
        assertTrue(atm.users.get("Kash").getLastname() == "Kash");
        assertTrue(atm.users.get("0404993021").getMobileNumber() == "0404993021");



    }




}