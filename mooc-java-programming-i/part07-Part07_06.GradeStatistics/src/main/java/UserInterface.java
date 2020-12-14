/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javicodx
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Grades points;

    public UserInterface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.points = grades;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            Integer grade = Integer.valueOf(scanner.nextLine());
            if (grade == -1) {
                break;
            }

            this.points.addGrades(grade);

        }

        this.printAverage();
        this.printAveragePassing();
        this.printPassPercentage();
        this.printGradeDistribution();

    }

    public void printAverage() {

        System.out.println("Point average (all): " + this.points.averageGrades());

    }

    public void printAveragePassing() {

        System.out.println("Point average (passing): " + (this.points.averagePasing() == 0 ? "-" : this.points.averagePasing()));

    }

    public void printPassPercentage() {
        System.out.println("Pass percentage: " + this.points.passPercentage());
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.points.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }

    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
