
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals = 0; // number of sold affordable meals
    private int heartyMeals = 0;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    //public double eatAffordably(double payment) {
    // an affordable meal costs 2.50 euros
    // increase the amount of cash by the price of an affordable mean and return the change
    // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    //if (payment < 2.50) {
    //    return payment;
    //}
    //this.money += 2.50;
    //double change = payment - 2.50;
    //this.affordableMeals++;
    //return change;
    //}
    //public double eatHeartily(double payment) {
    // a hearty meal costs 4.30 euros
    // increase the amount of cash by the price of a hearty mean and return the change
    // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    // if (payment < 4.30) {
    //    return payment;
    //}
    //this.money += 4.30;
    //double change = payment - 4.30;
    //this.heartyMeals++;
    //return change;
    //}
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() < 2.50) {
            return false;

        }

        this.money += 2.50;

        this.affordableMeals++;

        card.setBalance(card.balance() - 2.50);
        return true;

    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() < 4.30) {
            return false;
        }

        this.money += 4.30;

        this.heartyMeals++;

        card.setBalance(card.balance() - 4.30);
        return true;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        card.setBalance(card.balance() + sum);
    }

    @Override
    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals + ", number of sold hearty meals: " + this.heartyMeals;
    }
}
