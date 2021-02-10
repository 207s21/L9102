package sol;

/**
 * A class to represent a Movie. There are 3 types of movies: - Childrens -
 * Regular - New releases Each movie has a title and a price which is
 * represented by the Price class. Each price corresponds to their respective
 * price code.
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;

    /**
     * Create a new Movie with the given name and price code, which is the type of
     * movie.
     * 
     * @param name      the name of the movie
     * @param priceCode the type of movie, must be CHILDRENS, REGULAR, or
     *                  NEW_RELEASE
     */
    public Movie(String name, int priceCode) {
        title = name;
        setPriceCode(priceCode);
    }

    /**
     * Get the type of this movie.
     * 
     * @return
     */
    public int getPriceCode() {
        return price.getPriceCode();
    }

    /**
     * Set's the type of this movie depending on the priceCode passed in. The type
     * of this movie must be CHILDRENS, REGULAR, or NEW_RELEASE
     * 
     * @param priceCode
     */
    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    /**
     * Get's the title of this movie
     * 
     * @return the title of this movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get's the charge of this movie depending on the type and days rented.
     * 
     * @param daysRented the days this movie was rented
     * @return the charge of renting this movie.
     */
    double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    /**
     * Get's the frequent renter points for this movie depending on the type and
     * days rented.
     * 
     * @param daysRented the days this movie was rented
     * @return the frequent renter points for renting this movie.
     */
    int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}