import java.time.LocalDate;

public class CreditCard {
    private int cartNumber;
    private LocalDate expirationDate;
    private double availableCredit;
    private double creditLimit;

    public CreditCard(int cartNumber, String expirationDate, double creditLimit) {
        this.cartNumber = cartNumber;
        this.expirationDate = LocalDate.parse(expirationDate);
        this.creditLimit = creditLimit;
        this.availableCredit = creditLimit;
    };

    public boolean isVaid(){
        return expirationDate.isAfter(LocalDate.now());
    }

    public void makePurchase(double amount){
        if (amount > availableCredit)
            throw new IllegalArgumentException("Insufficient credit avaiable");

        availableCredit -= amount;
    }

    public double calculateOutstandingBalance(){
        return creditLimit - availableCredit;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cartNumber + '\'' +
                ", expirationDate=" + expirationDate +
                ", creditLimit=" + creditLimit +
                ", availableCredit=" + availableCredit +
                '}';
    }
}
