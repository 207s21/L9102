package sol;

/**
 * An abstract class for the price for a Movie.
 */
public abstract class Price {
    double basePrice;
    int dayLimit;

    /**
     * Get the price code for a movie.
     * 
     * @return the price code for a movie
     */
    abstract int getPriceCode();

    /**
     * Return's the amount charged for a movie's price depending on the amount of
     * days they rented.
     * 
     * @param daysRented the number of days the movie was rented.
     */
    abstract double getCharge(int daysRented);

    /**
     * Get's the frequent renter points for a movie depending on the days rented.
     * 
     * By default, the points returned is 1, regardless of the number of days
     * rented.
     * 
     * @param daysRented the number of days the movie was rented.
     */
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
