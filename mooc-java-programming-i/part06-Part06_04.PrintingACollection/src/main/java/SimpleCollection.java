
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        String output = "";

        if (this.elements.isEmpty()) {
            output = "The collection " + this.name + " is empty.";
            return output;
        }

        output = "The collection " + this.name + " has " + (this.elements.size() == 1 ? this.elements.size() + " element:\n" : this.elements.size() + " elements:\n");

        String letters = "";

        for (String element : this.elements) {
            if (this.elements.size() == 1) {
                letters = letters + element;
                break;

            }
            letters = letters + element + "\n";
        }

        return output + letters;

    }

}
