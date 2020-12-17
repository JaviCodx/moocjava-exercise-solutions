
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here

    }

    public static List<String> read(String file) {
        List<String> returned = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(row -> returned.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return returned;

    }

}
