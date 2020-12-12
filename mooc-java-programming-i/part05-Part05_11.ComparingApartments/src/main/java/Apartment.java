
import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int pricetotal;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.pricetotal = this.princePerSquare * this.squares;
    }

    public boolean largerThan(Apartment compared) {

        return (this.squares > compared.squares);

    }

    public int priceDifference(Apartment compared) {

        return Math.abs(this.pricetotal - compared.pricetotal);

    }

    public boolean moreExpensiveThan(Apartment compared) {

        return (this.pricetotal > compared.pricetotal);

    }
}
