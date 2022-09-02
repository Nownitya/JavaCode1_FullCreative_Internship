package record;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetail {
    String name;
    int roll;
    String city;
    int joinYear;


    ArrayList<Integer> _roll = new ArrayList<>();
    ArrayList<String> _name = new ArrayList<>();
    ArrayList<String> _city = new ArrayList<>();
    ArrayList<Integer> _joinYear = new ArrayList<>();



    public void addStudent() {

        Scanner studentInput = new Scanner(System.in);


        System.out.println("Enter Name: ");
        name = studentInput.nextLine();

        System.out.println("Enter Roll No.:");
        roll = Integer.parseInt(studentInput.nextLine());

        System.out.println("Enter City: ");
        city = studentInput.nextLine();

        System.out.println("Enter Year of Admission: ");
        joinYear = studentInput.nextInt();


        _roll.add(roll);
        _name.add(name);
        _city.add(city);
        _joinYear.add(joinYear);

        promptEnterKey();
    }


    public void showStudent() {

        for (int i = 0; i <= _name.size()-1; i++) {
            System.out.println("Name: " + _name.get(i));
            System.out.println("Roll: "+_roll.get(i));
            System.out.println("City: "+_city.get(i));
            System.out.println("Join Year: " + _joinYear.get(i));
            System.out.println("\n");
        }

        promptEnterKey();
    }

    public void deleteStudent() {
		System.out.println("Roll no.: " + _roll);
        Scanner removeRoll = new Scanner(System.in);
        roll = removeRoll.nextInt();
        if (_roll.contains(roll)) {

            int rollIndex = _roll.indexOf(roll);
            _roll.remove(rollIndex);
            _name.remove(rollIndex);
            _city.remove(rollIndex);
            _joinYear.remove(rollIndex);
        }
        screenOpen();
    }

    public void exitProgram() {
		System.exit(0);
    }

    public void promptEnterKey() {
        System.out.println("press \"Enter\" key to continue");
        Scanner scanners = new Scanner(System.in);
        scanners.nextLine();
        screenOpen();
    }

    public void screenOpen() {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Add Student");
        System.out.println("2: Show");
        System.out.println("3: Delete");
        System.out.println("4: Exit");

        int num = input.nextInt();
        switch (num) {
            case 1:
                addStudent();
                break;

            case 2:
                showStudent();
                break;

            case 3:
                deleteStudent();
                break;
            case 4:
                exitProgram();
                break;
        }
    }
}