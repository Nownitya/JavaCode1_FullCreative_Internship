package record;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetail {
    String name;
    int roll;
	int year;
    int math;
    int science;
    int english;
    int hindi;
    int per;


    ArrayList<Integer> _roll = new ArrayList<>();
    ArrayList<String> _name = new ArrayList<>();
	ArrayList<Integer> _year = new ArrayList<>();
    ArrayList<Integer> _math = new ArrayList<>();
    ArrayList<Integer> _science = new ArrayList<>();
    ArrayList<Integer> _english = new ArrayList<>();
    ArrayList<Integer> _hindi = new ArrayList<>();
    ArrayList<Integer> _per = new ArrayList<>();



    public void addStudent() {

        Scanner studentInput = new Scanner(System.in);


        System.out.print("Enter Name: ");
        name = studentInput.next();

        System.out.print("Enter Roll No.:");
        roll = Integer.parseInt(studentInput.next());
		
		System.out.print("Enter Year of join:");
        year = studentInput.nextInt();

        System.out.print("Maths Mark (Out of 100): ");
        math = Integer.parseInt(studentInput.next());
        System.out.print("Science Mark (Out of 100): ");
        science = Integer.parseInt(studentInput.next());
        System.out.print("English Mark (Out of 100): ");
        english = Integer.parseInt(studentInput.next());
        System.out.print("Hindi Mark (Out of 100): ");
        hindi = Integer.parseInt(studentInput.next());


        _roll.add(roll);
        _name.add(name);
		_year.add(year);
        _math.add(math);
        _science.add(science);
        _english.add(english);
        _hindi.add(hindi);

        previousScreen();
        promptEnterKey();
    }
	
	public void dashLine() {
        for (int j = 0; j<= 100; j++) {
            System.out.print("-");
        }
    }

    public void showStudent() {

        percentage();
        dashLine();
        System.out.println("");
        System.out.println("\troll \t\tname \t\tyear \t\tMath \t\tScience \t\tEnglish \t\tHindi \t\tTotal%");
        dashLine();
        System.out.println("");
        for (int i = 0; i <= _name.size() - 1; i++) {
//            System.out.println("\t" + _roll.get(i) + "\t\t\t" + _name.get(i) + "\t\t\t" + _city.get(i) + "\t\t\t" + _joinYear.get(i));

            System.out.print("\t" + _roll.get(i));
            System.out.print("\t\t" + _name.get(i));
            System.out.print("\t\t" + _year.get(i));
            System.out.print("\t\t" + _math.get(i));
            System.out.print("\t\t" + _science.get(i));
            System.out.print("\t\t" + _english.get(i));
            System.out.print("\t\t" + _hindi.get(i));
            System.out.print("\t\t" + _per.get(i));
            System.out.println("");
            dashLine();
            System.out.println("");
        }

        promptEnterKey();
    }
	
	public void percentage() {

        for (int i = 0; i <= _name.size() - 1; i++) {
            int sum = _math.get(i) + _science.get(i) + _english.get(i) + _hindi.get(i);
            per = (sum * 100) / 400;
            _per.add(per);
        }
    }

    public void deleteStudent() {
		System.out.println("Roll no.: " + _roll);
        Scanner removeRoll = new Scanner(System.in);
        roll = removeRoll.nextInt();
        if (_roll.contains(roll)) {

            int rollIndex = _roll.indexOf(roll);
            _roll.remove(rollIndex);
            _name.remove(rollIndex);
			_year.remove(rollIndex);
            _math.remove(rollIndex);
            _science.remove(rollIndex);
            _english.remove(rollIndex);
            _hindi.remove(rollIndex);
        }
        screenOpen();
    }
	
	private void search() {
        percentage();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter For Search");
        String given = input.nextLine();
//        int sa = Integer.parseInt(given);

        if (given.contains(" ")) {
            String[] str = given.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
//            System.out.println(given);
//            System.out.println("str[0]: "+str[0]);
//            System.out.println("str[1]: "+str[1]);
            if (isNumeric(str[0])) {
                int a1= Integer.parseInt(str[0]);
                if (_year.contains(a1)) {
                    System.out.println("Record Available: Integer");
                    System.out.println("");
                    System.out.println("\troll \t\tname \t\tyear \t\tMath \t\tScience \t\tEnglish \t\tHindi \t\tTotal%");
                    dashLine();
                    System.out.println("");
                    for (int i = 0; i <= _year.size() - 1; i++) {
                        if (_year.get(i)== a1) {
                            System.out.print("\t" + _roll.get(i));
                            System.out.print("\t\t" + _name.get(i));
                            System.out.print("\t\t" + _year.get(i));
                            System.out.print("\t\t" + _math.get(i));
                            System.out.print("\t\t" + _science.get(i));
                            System.out.print("\t\t" + _english.get(i));
                            System.out.print("\t\t" + _hindi.get(i));
                            System.out.print("\t\t" + _per.get(i));
                            System.out.println("");
                            dashLine();
                            System.out.println("");
                        }
                    }
                } else {
                    System.out.println("Record not Available: Integer");
                }
            } else {
                String a2 = str[0].trim();
//                System.out.println("111: " + a2);
//                System.out.println(_name.get(0));
//                System.out.println(_name.contains(str[0]));
//                System.out.println(_name.contains(a2));
                if (_name.contains(a2)) {
                    System.out.println("Record Available: String");

                    System.out.println("");
                    System.out.println("\troll \t\tname \t\tyear \t\tMath \t\tScience \t\tEnglish \t\tHindi \t\tTotal%");
                    dashLine();
                    System.out.println("");
                    for (int i = 0; i <= _name.size() - 1; i++) {

                        if (_name.get(i).equals(a2)) {
                            System.out.print("\t" + _roll.get(i));
                            System.out.print("\t\t" + _name.get(i));
                            System.out.print("\t\t" + _year.get(i));
                            System.out.print("\t\t" + _math.get(i));
                            System.out.print("\t\t" + _science.get(i));
                            System.out.print("\t\t" + _english.get(i));
                            System.out.print("\t\t" + _hindi.get(i));
                            System.out.print("\t\t" + _per.get(i));
                            System.out.println("");
                            dashLine();
                            System.out.println("");
                        }
                    }
                } else {
                    System.out.println("Record not Available: String");
                }
            }
            if (isNumeric(str[1])) {
                int a3 = Integer.parseInt(str[1]);
                if (_year.contains(a3)) {
                    System.out.println("Record Available: Integer");
                    System.out.println("");
                    System.out.println("\troll \t\tname \t\tyear \t\tMath \t\tScience \t\tEnglish \t\tHindi \t\tTotal%");
                    dashLine();
                    System.out.println("");
                    for (int i = 0; i <= _year.size() - 1; i++) {
                        if (_year.get(i)== a3) {
                            System.out.print("\t" + _roll.get(i));
                            System.out.print("\t\t" + _name.get(i));
                            System.out.print("\t\t" + _year.get(i));
                            System.out.print("\t\t" + _math.get(i));
                            System.out.print("\t\t" + _science.get(i));
                            System.out.print("\t\t" + _english.get(i));
                            System.out.print("\t\t" + _hindi.get(i));
                            System.out.print("\t\t" + _per.get(i));
                            System.out.println("");
                            dashLine();
                            System.out.println("");
                        }
                    }
                } else {
                    System.out.println("Record not Available: Integer");
                }
            } else {
                String a4 = str[1].trim();
                if (_name.contains(a4)) {
                    System.out.println("Record Available: String");

                    System.out.println("");
                    System.out.println("\troll \t\tname \t\tyear \t\tMath \t\tScience \t\tEnglish \t\tHindi \t\tTotal%");
                    dashLine();
                    System.out.println("");
                    for (int i = 0; i <= _name.size() - 1; i++) {

                        if (_name.get(i).equals(a4)) {
                             System.out.print("\t" + _roll.get(i));
                            System.out.print("\t\t" + _name.get(i));
                            System.out.print("\t\t" + _year.get(i));
                            System.out.print("\t\t" + _math.get(i));
                            System.out.print("\t\t" + _science.get(i));
                            System.out.print("\t\t" + _english.get(i));
                            System.out.print("\t\t" + _hindi.get(i));
                            System.out.print("\t\t" + _per.get(i));
                            System.out.println("");
                            dashLine();
                            System.out.println("");
                        }
                    }
                } else {
                    System.out.println("Record not Available: String");
                }
            }
        } else {
//            System.out.println(given.length());
//        for (int i = 0; i <= given.length(); i++) {
            if (isNumeric(given)) {
                int sa = Integer.parseInt(given);
                if (_roll.contains(sa)) {
                    System.out.println("Record Available Integer");
                } else {
                    System.out.println("Record not Available Integer");
                }

            } else if (!isNumeric(given)){
                if (_name.contains(given)) {
                    System.out.println("Record Available String");

                } else {
                    System.out.println("Record not Available String");
                }
            }
        }

        screenOpen();
    }
	
	
	
	//	Checking given String is numeric or String
	public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
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
	public void previousScreen() {


    }

    public void screenOpen() {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Add Student");
        System.out.println("2: Show");
        System.out.println("3: Delete");
        System.out.println("4: Search");
        System.out.println("5: Exit");

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
                search();
                break;
            case 5:
                exitProgram();
                break;
        }
    }
}