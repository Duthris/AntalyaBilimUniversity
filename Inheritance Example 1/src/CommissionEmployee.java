
public class CommissionEmployee extends Object {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double comissionRate;

	public CommissionEmployee (String firstName, String lastName, 
		String socialSecurityNumber, double grossSales, double comissionRate) {
		
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		if (comissionRate <= 0.0 || comissionRate >= 1.0) {
			throw new IllegalArgumentException("Comission rate must be > 0.0 and < 1.0");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
		
	}
	
	public String getFirstName() {return firstName;}
	
	public String getLastName() {return lastName;}
	
	public String getSocialSecurityNumber() {return socialSecurityNumber;}
	
	public void setGrossSales (double grossSales) {
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() {return grossSales;}
	
	public void setComissionRate(double comissionRate) {
		if (comissionRate <= 0.0 || comissionRate >= 1.0) {
			throw new IllegalArgumentException("Comission Rate must be > 0.0 and < 1.0");
		}
		
		this.comissionRate = comissionRate;
	}
	
	public double getComissionRate() {return comissionRate;}
	
	public double earnings() {return comissionRate * grossSales;}
	
	public String toString() {
		return String.format("%s: %s %s%n%s:  %s%n%s:  %.2f%n%s:  %.2f", 
				"comission employee", firstName, lastName, 
				"social security number", socialSecurityNumber, 
				"gross sales", grossSales, 
				"Comission Rate", comissionRate);
	}
}
