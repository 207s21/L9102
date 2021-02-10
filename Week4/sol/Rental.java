package sol;

/**
 * A class to represent the rental of a movie.
 * 
 * This contains the movie rented as well as the number of days the movie was
 * rented.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Create a new Rental with the movie that is being rented as well as the days
     * this movie is going to be rented for.
     * 
     * @param movie      the movie being rented
     * @param daysRented the number of days this movie is going to be rented
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Get the number of days that this rental is valid for.
     * 
     * @return the number of days that this rental is for.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Get the movie that is a part of this rental.
     * 
     * @return the movie that is part of this rental.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Get the charge of this rental depending on the movie and the number of days
     * it is being rented for.
     * 
     * @return the total charge of this rental.
     */
    double getCharge() {
        return movie.getCharge(daysRented);
    }

    /**
     * Get the number of frequent renter points earned by making this rental.
     * 
     * @return the frequent renter points earned.
     */
    int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

}