
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Literacy> register = new ArrayList<>();
        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get("literacy.csv"))
                    // splitting the row into parts on the ";" character
                    .map(row -> row.split(","))
                    // deleting the split rows that have less than two parts (we want the rows to always contain both the name and the birth year)
                    
                    // creating persons from the parts
                    .map(parts -> new Literacy(parts[2], parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    // and finally add the persons to the list
                    .sorted()
                    .forEach(literacy -> System.out.println(literacy));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
