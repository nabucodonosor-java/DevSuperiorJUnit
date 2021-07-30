package tests.factory;

import entities.Financing;

public class FinancingFactory {
	
	public static Financing createFinancing100() {
		return new Financing(100.0, 500.0, 5);
	}
	
	public static Financing createFinancing200WithException() {
		return new Financing(200.0, 10.0, 4);
	}
	
}
