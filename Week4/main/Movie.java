package main;

public class Movie {
public String _title;
public int _priceCode;
public Movie(String title, int priceCode) {
_title = title;
_priceCode = priceCode;
}
public int getPriceCode() {
return _priceCode;
}
public void setPriceCode(int arg) {
_priceCode = arg;
}
public String getTitle (){
return _title;
}
}