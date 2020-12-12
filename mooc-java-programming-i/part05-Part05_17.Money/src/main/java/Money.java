
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
        // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {

        double totalcompared = compared.euros + compared.cents / 100.0;
        double total = this.euros + this.cents / 100.0;

        return total < totalcompared;

    }

    public Money minus(Money decreaser) {

        if (lessThan(decreaser)) {

            return new Money(0, 0);
        }

        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();

        if (cents < 0) {
            cents += 100;
            euros -= 1;
        }

        return new Money(euros, cents);

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
