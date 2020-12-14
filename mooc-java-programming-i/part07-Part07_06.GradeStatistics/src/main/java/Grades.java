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

public class Grades {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grades() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();

    }

    public void addGrades(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.points.add(grade);
            this.grades.add(this.pointsToGrade(grade));
        }

    }

    public int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageGrades() {

        if (this.points.isEmpty()) {

            return -1;

        }

        int sum = 0;
        int counter = 0;

        for (int grade : this.points) {
            sum += grade;
            counter++;
        }

        return sum / counter;

    }

    public int getPasing() {
        int counter = 0;

        for (int grade : this.points) {
            if (grade >= 50) {

                counter++;
            }

        }
        return counter;
    }

    public double averagePasing() {
        int sum = 0;

        for (int grade : this.points) {
            if (grade >= 50) {
                sum += grade;

            }
        }

        if (this.getPasing() == 0) {
            return 0;
        }

        return sum / this.getPasing();

    }

    public double passPercentage() {

        return 100.0 * this.getPasing() / this.points.size();

    }

}
