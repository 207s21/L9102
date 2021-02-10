package sol;

/**
 * The price for a New Release Movie.
 */
public class RegularPrice extends Price {
    /**
     * Set's this class' base price and the amount of days until the charge gets
     * incremented.
     */
    public RegularPrice() {
        this.basePrice = 2;
        this.dayLimit = 2;
    }

    /**
     * Return's the amount charged for a regular movie's price depending on the
     * amount of days they rented.
     * 
     * @param daysRented the number of days the movie was rented.
     */
    double getCharge(int daysRented) {
        double result = basePrice;
        if (daysRented > this.dayLimit)
            result += (daysRented - this.dayLimit) * 1.5;
        return result;
    }

    /**
     * Get the price code for a regular movie.
     * 
     * @return the price code for a regular movie
     */
    int getPriceCode() {
        return Movie.REGULAR;
    }
}