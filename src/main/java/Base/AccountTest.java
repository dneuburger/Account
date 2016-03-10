package Base;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	@Before
	public void setUp() throws Exception{
		Account Account1 = new Account();
	}
	
	@After
	public void tearDown() throws Exception{
		Account1 = null;
	}
	
	@Test
	public void testGetId() {
		assertEquals(Account1.getId(),1122);
	}
	
	@Test
	public void testAnnualInterestRate() {
		assertEquals((long)Account1.getAnnualInterestRate(),(long)0.045);
	}
	
	//Test on MonthlyInterestRate() method
	@Test
	public void testMonthlyInterestRate() {
		assertEquals((long)Account1.getMonthlyInterestRate(),(long)0.00375);
	}
	
	//Test on withdraw() method
	@Test
	public void testWithdraw() {
		Account1.deposit(3000);
		assertEquals((long)Account1.getBalance(),(long)23000);
	}
	
	//Test on deposit() method
	@Test
	public void testDeposit() throws InsufficientFundsException {
		Account1.withdraw(2500);
		assertEquals((long)Account1.getBalance(),(long)17500);
	}
	
	@Test
	public void testDateCreated() {
		assertEquals(Account1.getDateCreated(),new Date());
	
	System.out.println("Account Balance: $ " + Account1.getBalance());
	System.out.println("Monthly Interest Rate: " + Account1.getMonthlyInterestRate() * Account1.getBalance());
	System.out.println("Date Created: " + Account1.getDateCreated());
	}
	
}