package entities;

public class CurrencyConverter {
	

	public static final double IOF = 6.0 ;
	public double dollar;
	public double quantity;
	public double total;
	
	public double Calcule() {
		return total = quantity * dollar + (quantity * dollar * IOF/100);
	}
	

}
