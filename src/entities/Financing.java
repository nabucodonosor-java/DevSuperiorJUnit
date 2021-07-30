package entities;

public class Financing {

	private Double totalAmount;
	private Double income;
	private Integer months;

	public Financing() {
	}

	public Financing(Double totalAmount, Double income, Integer months) {
		
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
		
		if (quota() > income / 2.0) {
			throw new IllegalArgumentException("A prestação não pode ser maior que metade da renda");
		}
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public double entry() {
		double entry = totalAmount * 0.2;
		return entry;
	}

	public double quota() {
		double entry = totalAmount * 0.2;
		double quota = (totalAmount - entry) / months;
		return quota;
	}
	
	public void setTotalAmount(Double totalAmount) {
		if (quota() > income / 2.0) {
			throw new IllegalArgumentException("A prestação não pode ser maior que metade da renda");
		}

		this.totalAmount = totalAmount;
	}
}
