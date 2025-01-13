public class Main {
    public static void main(String[] args) {
        try {
            CreditCard creditCard = new CreditCard(123456,"2025-01-20",500_000);

            Customer customer = new Customer("Arafat",20,creditCard);

            System.out.println(customer);

            if (creditCard.isVaid())
                System.out.println("The card is valid");
            else
                System.out.println("The card is not valid");

            creditCard.makePurchase(300_000);

            double avaiableCredit = creditCard.getAvailableCredit();
            System.out.println("The Available Credit is : " + avaiableCredit);

            double outstandingBalance = creditCard.calculateOutstandingBalance();
            System.out.println("The Outstanding Balance is : " + outstandingBalance);

//            creditCard.makePurchase(400_0000); //Insufficient credit avaiable
        }catch (IllegalAccessError e){
            System.out.println(e.getMessage());
        }
    }
}