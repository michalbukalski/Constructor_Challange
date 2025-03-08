public class Main {

    public static void main(String[] args) {
        // Użycie konstruktora nr 1 (pełny)
        Customer customer1 = new Customer("Alice", 8000.0, "alice@example.com");
        System.out.println(customer1.getName() + " - " + customer1.getCreditLimit() + " - " + customer1.getEmailAddress());

        // Użycie konstruktora nr 2 (bezargumentowego)
        Customer customer2 = new Customer();
        System.out.println(customer2.getName() + " - " + customer2.getCreditLimit() + " - " + customer2.getEmailAddress());

        // Użycie konstruktora nr 3 (tylko imię i email)
        Customer customer3 = new Customer("Bob", "bob@example.com");
        System.out.println(customer3.getName() + " - " + customer3.getCreditLimit() + " - " + customer3.getEmailAddress());
    }
}
