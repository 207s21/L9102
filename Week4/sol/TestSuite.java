import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSuite {
    public static Customer c0, c1, c2;
    public static Movie m0, m1, m2, m3;
    public static Rental r0, r1, r2;

    // Change to @BeforeClass if on JUnit 4
    @BeforeAll
    public static void setUp() {
        c0 = new Customer("TestCustomer0");
        c1 = new Customer("TestCustomer1");
        c2 = new Customer("TestCustomer2");

        m0 = new Movie("The Phantom Menace", 0);
        m1 = new Movie("Tenet", 1);
        m2 = new Movie("Over the Moon", 2);
        m3 = new Movie("The Emoji Movie", 6);

        r0 = new Rental(m0,0);
        r1 = new Rental(m1,3);
        r2 = new Rental(m2,10);
    }

    @Test
    void addRental() {
        c2.addRental(r0);
        c2.addRental(r0);
        // Making sure our customer can rent the same movie twice
        assertEquals("Rental Record for TestCustomer2\n" +
                "\tThe Phantom Menace\t2.0\n" +
                "\tThe Phantom Menace\t2.0\n" +
                "Amount owed is 4.0\n" +
                "You earned 2 frequent renter points", c2.statement());
    }

    @Test
    void getName() {
        assertEquals("TestCustomer0", c0.getName());
        assertEquals("TestCustomer1", c1.getName());
        assertEquals("TestCustomer2", c2.getName());
    }

    @Test
    void statement() {
        assertEquals("Rental Record for TestCustomer0\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", c0.statement());

        c0.addRental(r0);
        assertEquals("Rental Record for TestCustomer0\n" +
                "\tThe Phantom Menace\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", c0.statement());

        c0.addRental(r1);
        assertEquals("Rental Record for TestCustomer0\n" +
                "\tThe Phantom Menace\t2.0\n" +
                "\tTenet\t9.0\n" +
                "Amount owed is 11.0\n" +
                "You earned 3 frequent renter points", c0.statement());

        c1.addRental(r2);
        assertEquals("Rental Record for TestCustomer1\n" +
                "\tOver the Moon\t12.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 1 frequent renter points", c1.statement());
    }
    @Test
    void getDaysRented() {
        assertEquals(0, r0.getDaysRented());
        assertEquals(3, r1.getDaysRented());
        assertEquals(10, r2.getDaysRented());
    }

    @Test
    void getMovie() {
        assertEquals(m0, r0.getMovie());
        assertEquals(m1, r1.getMovie());
        assertEquals(m2, r2.getMovie());
    }

    @Test
    void getPriceCode() {
        assertEquals(0, m0.getPriceCode());
        assertEquals(1, m1.getPriceCode());
        assertEquals(2, m2.getPriceCode());
    }

    @Test
    void setPriceCode() {
        assertEquals(6, m3.getPriceCode());
        m3.setPriceCode(10);
        assertEquals(10, m3.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("The Phantom Menace", m0.getTitle());
        assertEquals("Tenet", m1.getTitle());
        assertEquals("Over the Moon", m2.getTitle());
    }
}
