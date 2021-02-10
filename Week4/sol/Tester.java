class Tester{
    public static void main(String[] args)
    {
        Customer c0 = new Customer("TestCustomer0");
        System.out.println("c0 Name = " + (c0.getName().equals( "TestCustomer0")));

        Customer c1 = new Customer("TestCustomer1");
        System.out.println("c1 Name = " + (c1.getName().equals( "TestCustomer1")));

        Movie m0 = new Movie("The Phantom Menace", 0);
        System.out.println("m0 Title = " + (m0.getTitle().equals( "The Phantom Menace")));
        System.out.println("m0 Price = " + (m0.getPriceCode() == (0)));


        Movie m1 = new Movie("Tenet", 1);
        System.out.println("m1 Title = " + (m1.getTitle().equals( "Tenet")));
        System.out.println("m1 Price = " + (m1.getPriceCode() == (1)));

        Movie m2 = new Movie("Over the Moon", 2);
        System.out.println("m2 Title = " + (m2.getTitle().equals( "Over the Moon")));
        System.out.println("m2 Price = " + (m2.getPriceCode() == (2)));

        Rental r0 = new Rental(m0,0);
        System.out.println("r0 Movie = " + (r0.getMovie() == m0));
        System.out.println("r0 daysRented = " + (r0.getDaysRented() == (0)));

        Rental r1 = new Rental(m1,3);
        System.out.println("r1 Movie = " + (r1.getMovie() == m1));
        System.out.println("r1 daysRented = " + (r1.getDaysRented() == (3)));

        Rental r2 = new Rental(m2,10);
        System.out.println("r2 Movie = " + (r2.getMovie() == m2));
        System.out.println("r2 daysRented = " + (r2.getDaysRented() == (10)));

        System.out.println("c0 statement = "+c0.statement().equals("Rental Record for TestCustomer0\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points"));
        c0.addRental(r0);
        System.out.println("c0 add r0 = "+c0.statement().equals("Rental Record for TestCustomer0\n" +
                "\tThe Phantom Menace\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points"));
        c0.addRental(r1);
        System.out.println("c0 add r1 = "+c0.statement().equals("Rental Record for TestCustomer0\n" +
                "\tThe Phantom Menace\t2.0\n" +
                "\tTenet\t9.0\n" +
                "Amount owed is 11.0\n" +
                "You earned 3 frequent renter points"));
        c1.addRental(r2);
        System.out.println("c1 add r2 = "+c1.statement().equals("Rental Record for TestCustomer1\n" +
                "\tOver the Moon\t12.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 1 frequent renter points"));

    }
}