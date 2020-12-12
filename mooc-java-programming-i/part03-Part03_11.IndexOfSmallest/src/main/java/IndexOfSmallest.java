
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                list.add(input);
                break;
            }

            list.add(input);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        int smallest = 9999;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                indexes.add(i);
            }

        }
        
        System.out.println("Smallest number: "+ smallest);
        for (int j = 0; j < list.size(); j++) {
            if (smallest == list.get(j)){
            System.out.println("Found at index: " + j);
            }
        }
        
       
    }
}
