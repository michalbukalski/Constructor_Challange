public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    // Konstruktor nr 1 - przyjmuje wszystkie trzy argumenty
    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // Konstruktor nr 2 - bezargumentowy, wywołuje inny konstruktor z domyślnymi wartościami
    public Customer() {
        this("Default Name", 5000.0, "default@example.com");
    }

    // Konstruktor nr 3 - tylko imię i email, domyślny limit kredytowy
    public Customer(String name, String emailAddress) {
        this(name, 1000.0, emailAddress);
    }

    // Gettery
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
