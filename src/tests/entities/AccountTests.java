package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());;
		
	}
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		
		double amount = -10.0;
		double expectedValue = 10.0;
		Account acc = new Account(1L, 10.0);
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());;
	}

}
