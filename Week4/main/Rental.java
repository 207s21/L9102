package main;

public class Rental {
public Movie _movie;
public int _daysRented;
public Rental(Movie movie, int daysRented) {
_movie = movie;
_daysRented = daysRented;
}
public int getDaysRented() {
return _daysRented;
}
public Movie getMovie() {
return _movie;
}
}