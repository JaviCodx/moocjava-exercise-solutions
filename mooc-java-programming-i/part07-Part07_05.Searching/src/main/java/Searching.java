
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        // assuming the variable searched exits
        // assuming the variable list exits
        /*begin = 0 // the 0th index of the list (i.e, the first index of the list)
        end = size(list) - 1 // the last index in the list

        repeat until begin is larger than end:
            middle = (end + begin) / 2

            if the value at list[middle] is searched
                return the value of the variable middle

            if the value at list[middle] is smaller than searched
                begin = middle + 1

            if the value at list[middle] is larger than searched
                end = middle - 1

        return value -1*/

        int start = 0;
        int end = books.size() - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (searchedId == books.get(middle).getId()) {
                return middle;
            } else if (books.get(middle).getId() < searchedId) {
                start = middle + 1;

            } else if (books.get(middle).getId() > searchedId) {
                end = middle - 1;

            }

        }

        return -1;
    }

}
