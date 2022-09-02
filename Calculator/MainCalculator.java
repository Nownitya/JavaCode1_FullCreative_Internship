import calculator.Calculator;



import java.util.Scanner;

class MainCalculator {
    public static void main(String[] args) {

        Calculator c = new Calculator();
            Scanner sc = new Scanner(System.in);
            System.out.println("Addition: 1");
            System.out.println("Subtraction: 2");
            System.out.println("Multiplication: 3");
            System.out.println("Division: 4");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    Scanner scAdd = new Scanner(System.in);
                    System.out.println("Enter first no.");
                    double a = Double.parseDouble(scAdd.next());
                    System.out.println("Enter Second no.");
                    double b = Double.parseDouble(scAdd.next());
//                    c.addition(a, b);
                    System.out.println(c.addition(a,b));
                    break;
                case 2:
                    Scanner scSub = new Scanner(System.in);
                    System.out.println("Enter first no.");
                    double a2 = Double.parseDouble(scSub.next());
                    System.out.println("Enter Second no.");
                    double b2 = Double.parseDouble(scSub.next());
                    System.out.println(c.subtractions(a2,b2));
                    break;
                case 3:
                    Scanner scMul = new Scanner(System.in);
                    System.out.println("Enter first no.");
                    double a3 = Double.parseDouble(scMul.next());
                    System.out.println("Enter Second no.");
                    double b3 = Double.parseDouble(scMul.next());
                    System.out.println(c.multiplication(a3, b3));

                    break;
                case 4:
                    Scanner scDiv = new Scanner(System.in);
                    System.out.println("Enter first no.");
                    double a4 = Double.parseDouble(scDiv.next());
                    System.out.println("Enter Second no.");
                    double b4 = Double.parseDouble(scDiv.next());
                    System.out.println(c.division(a4,b4));
                    break;
            }

    }


}