
public class Main {

    public static void main(String[] args) {
         
        Debt mortgage = new Debt(120000.0, 1.2);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

       while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
