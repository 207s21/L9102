package sol;

import java.util.*;

/**
 * A customer class.
 * 
 * Each customer has a name and a list of the rentals they currently have.
 * 
 * A customer can make rentals as well as get the total charge of their rentals,
 * a statement representing their rental record and the total frequent renter
 * points they have.
 */
public class Customer {
    private String name;
    private Vector rentals = new Vector();

    /**
     * Makes a new customer with their name
     * 
     * @param name
     */
    public Customer(String name) {
        name = name;
    }

    /**
     * Adds a new rental for this customer
     * 
     * @param arg
     */
    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    /**
     * Gets the name of this customer
     * 
     * @return the name of this customer
     */
    public String getName() {
        return name;
    }

    /**
     * Return's this customer's statement
     * 
     * @return string representation of this customer's statement.
     */
    public String statement() {
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    /**
     * Get's this customer's total frequent renter points.
     * 
     * @return this customer's total frequent renter points.
     */
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    /**
     * Get's this customer's total charge.
     * 
     * @return this customer's total charge.
     */
    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
}