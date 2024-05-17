package entities;

public final class TaxIndividual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public TaxIndividual() {
		super();
	}

	public TaxIndividual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double taxPayment;
		if (getAnualIncome() < 20.000) {
			taxPayment = getAnualIncome() * 0.15 - healthExpenditures * 0.50;
		} else {
			taxPayment = getAnualIncome() * 0.25 - healthExpenditures * 0.50;
		}
		return taxPayment;
	}
}
