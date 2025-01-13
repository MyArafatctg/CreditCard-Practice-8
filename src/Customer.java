public class Customer {
    private String name;
    private int age;
    private CreditCard creditCard;

    public Customer(String name, int age, CreditCard creditCard) {
        if (age < 18){
            throw new IllegalArgumentException("Customer mustbe 18 years old.");
        }
        this.name = name;
        this.age = age;
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", creditCard=" + creditCard +
                '}';
    }
}
