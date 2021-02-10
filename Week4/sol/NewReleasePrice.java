package sol;

/**
 * The price for a New Release Movie.
 */
public class NewReleasePrice extends Price {
    /**
     * Set's this class' base price and the amount of days until the charge gets
     * incremented.
     */
    public NewReleasePrice() {
        this.basePrice = 3;
        this.dayLimit = 1;
    }

    /**
     * Return's the amount charged for a new release's price depending on the amount
     * of days they rented.
     * 
     * @param daysRented the number of days the movie was rented.
     */
    double getCharge(int daysRented) {
        return daysRented * this.basePrice;
    }

    /**
     * Get the price code for a new release movie.
     * 
     * @return the price code for a new release movie
     */
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    /**
     * Get's the frequent renter points for a new release movie depending on the
     * days rented.
     * 
     * @param daysRented the number of days the movie was rented.
     */
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > this.dayLimit) ? 2 : 1;
    }
}
