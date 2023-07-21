package Desafio01;

public class Bill {
	public char gender;
	public int beer, softDrink, barbecue;
	
	public double ticket() {
		char UppercaseGender = Character.toUpperCase(gender);
		double ticketPrice = (UppercaseGender == 'F') ? 8 : 10;
		return ticketPrice;
	}
	
	public double feeding() {
		return (beer * 5) + (softDrink * 3) + (barbecue * 7);
	}
	
	public double cover() {
		double coverPrice = feeding() < 30 ? 4 : 0;
		return coverPrice;
	}
	
	public double total() {
		return ticket() + feeding() + cover();
	}
	
}
