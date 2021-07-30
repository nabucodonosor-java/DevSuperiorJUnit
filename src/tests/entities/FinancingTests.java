package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void financing100AndIncome500AndMonths5ShouldSuccess() {
		
		double expectedValueEntry = 20.0;
		double expectedValueQuota = 16.0;
		Financing f = FinancingFactory.createFinancing100();
		
		Assertions.assertEquals(expectedValueEntry, f.entry());
		Assertions.assertEquals(expectedValueQuota, f.quota());
		
	}
	
	
	@Test
	public void financing100ShouldThrowException() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = FinancingFactory.createFinancing200WithException();
			f.entry();
			f.quota();
		});
	}

}
