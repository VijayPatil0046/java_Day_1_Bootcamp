import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number 1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter a number 2 : ");
            int num2 = sc.nextInt();
            System.out.println("Enter \n+ for addition\n- for substraction\n* for mutiplicaion\n/ for division");
            String choice = sc.next();

            switch (choice) {
                case "+":
                    System.out.println("Addition: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Addition: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
            System.out.println("To continue enter Y to exit enter N");
            String op = sc.next();
            if (op.equals("N") || op.equals("n")) {
                System.out.println("Exiting from the application ... ");
                break;
            }
        }
    }
}
