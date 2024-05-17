import java.time.LocalDate;

public class Milk extends Product{
    private LocalDate expirationDate;

    public Milk(String name, float price, String description, int quantity, LocalDate expirationDate) {
        super(name, price, description, quantity);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public void showInfo() {
        System.out.println("Product Information:");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("--------------");
    }

    public void checkExpired() {
        LocalDate currentDate = LocalDate.now();
        if (expirationDate.isBefore(currentDate)) {
            System.out.println("The product has expired.");
        } else {
            System.out.println("The product is still valid.");
        }
    }
}
