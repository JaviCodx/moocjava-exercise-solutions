
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));

        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        for (Book book : books) {
            if (choice.equals("everything")) {
                System.out.println(book);
            } else if (choice.equals("name")) {
                System.out.println(book.getTitle());
            } else if (choice.equals("pages")) {
                System.out.println(book.getPages());
            } else if (choice.equals("year")) {
                System.out.println(book.getYear());
            }
        }

    }
}
