import marks.StudentMarksheet;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = input.nextLine();

        System.out.println("Enter Roll Number");
        int rollNo = input.nextInt();

        System.out.println("Maths Mark (Out of 100): ");
        int math = input.nextInt();
        System.out.println("Science Mark (Out of 100): ");
        int science = input.nextInt();
        System.out.println("English Mark (Out of 100): ");
        int english = input.nextInt();
        System.out.println("Hindi Mark (Out of 100): ");
        int hindi = input.nextInt();

        StudentMarksheet marks = new StudentMarksheet();
		int per = marks.sub(math, science, english, hindi);
		
		System.out.println("");
        System.out.println("Student name: " + name);
        System.out.println("Roll No.: " + rollNo);
		System.out.println("Percentage :" + per+"%");
        System.out.println("");
        marks.sub(math,science,english,hindi);
    }
}