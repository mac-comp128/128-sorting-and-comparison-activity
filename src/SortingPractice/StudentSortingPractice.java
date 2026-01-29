package SortingPractice;

import java.util.Arrays;

/**
 * Implementation of the first / most boring step of this activity.
 */
public class StudentSortingPractice {
    private static Student[] students;


    /**
     * initialize the students array.
     */
    private static void initStudents() {
        students = new Student[10];
        students[0] = new Student("Draven", "Reyer", 609377);
        students[1] = new Student("Slavica"," Teke", 160610);
        students[2] = new Student("Alexandra","Reis", 901211);
        students[3] = new Student("Draven","Reyer", 235054);
        students[4] = new Student("Pallav", "Ahearn", 319131);
        students[5] = new Student("Pallav", "McQueen", 531242);
        students[6] = new Student("Victorius", "Wortham", 902373);
        students[7] = new Student("Alexandra", "Reis", 234628);
        students[8] = new Student("Gaios", "Best", 131537);
        students[9] = new Student("Wigbrand", "Spalding", 704970);
    }
    public static void main(String[] args) {
        initStudents();

        System.out.println("Initial Order:");
        Arrays.stream(students).forEach(s -> System.out.println(s));

        System.out.println("By Last Name:");
        // TODO: Sort by Last Name (Natural Ordering)
        Arrays.stream(students).forEach(s -> System.out.println(s));

        System.out.println("By First Name:");
        // TODO: Sort by First Name (Alternative Ordering)
        Arrays.stream(students).forEach(s -> System.out.println(s));
    }
}
