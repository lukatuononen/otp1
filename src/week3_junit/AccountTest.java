package week3_junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() throws Exception {
        account = new Account();
    }

    @After
    public void tearDown() throws Exception {
        account = null;
    }

    @Test
    public void deposit() {
        account.deposit(72);
        assertEquals(72.0, account.getBalance(), 0.0);
    }

    @Test
    public void withdraw() {
        account.deposit(322);
        double withdrawlSum = account.withdraw(72);
        assertEquals(250.0, account.getBalance(), 0.0);
        assertEquals(72.0, withdrawlSum, 0.0);
    }

    @Test
    public void getBalance() {
        assertEquals(0.0, account.getBalance(), 0.0);
        account.deposit(72);
        assertEquals(72.0, account.getBalance(), 0.0);
    }
}