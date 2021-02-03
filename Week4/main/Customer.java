package main;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
public String _name;
public Vector _rentals = new Vector();
public Customer (String name){
_name = name;
};
public void addRental(Rental arg) {
_rentals.addElement(arg);
}
public String getName (){
return _name;
};
public String statement() {
	double totalAmount = 0;
	int frequentRenterPoints = 0;
	Enumeration rentals = _rentals.elements();
	String result = "Rental Record for " + getName() + "\n";
	while (rentals.hasMoreElements()) {
		double thisAmount = 0;
		Rental each = (Rental) rentals.nextElement();
		//determine amounts for each line
		switch (each.getMovie().getPriceCode()) {
			case 0: //Regular Movie
				thisAmount += 2;
				if (each.getDaysRented() > 2)
					thisAmount += (each.getDaysRented() - 2) * 1.5;
				break;
			case 1: //New Release
				thisAmount += each.getDaysRented() * 3;
				break;
			case 2: //Movie for children
				thisAmount += 1.5;
				if (each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented() - 3) * 1.5;
				break;
		}
		// add frequent renter points
		frequentRenterPoints ++;
		// add bonus for a two day new release rental
		if ((each.getMovie().getPriceCode() == 1) && each.getDaysRented() > 1) 			 frequentRenterPoints ++;
		//show figures for this rental
		result += "\t" + each.getMovie().getTitle()+ "\t" +
		String.valueOf(thisAmount) + "\n";
		totalAmount += thisAmount;
	}
	//add footer lines
	result += "Amount owed is " + String.valueOf(totalAmount) +
	"\n";
	result += "You earned " + String.valueOf(frequentRenterPoints)
	+
	" frequent renter points";
	return result;
}
}