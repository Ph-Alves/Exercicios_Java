package entities;

public final class TaxCompany extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public TaxCompany() {
		super();
	}

	public TaxCompany(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		double taxPayment;
		if (numberOfEmployees > 10) {
			taxPayment = getAnualIncome() * 0.14;
		} else {
			taxPayment = getAnualIncome() * 0.16;
		}
		return taxPayment;
	}
}
