
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {
    
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        int i = Integer.valueOf(scanner.nextLine());
        numbers.add(i);
        
        
        List<Integer> filtered = positive(numbers);
        System.out.println(filtered.toString());

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        
        return numbers.stream().filter(n-> n >= 0).collect(Collectors.toCollection(ArrayList::new));
        
        
        
    }

}
