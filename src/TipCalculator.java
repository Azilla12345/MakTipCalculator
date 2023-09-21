import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello, please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome to Tip Calculator, " + name);
        System.out.print("Amount of people in group: ");
        int people = scan.nextInt();
        System.out.print("What's the the tip percentage (0-100): ");
        double tip = scan.nextDouble();

        boolean repeat = true;

        double answer = 0.0;
        double total_cost = 0;

        while (answer != -1) {
            System.out.print("Enter the cost of the item (enter -1 once finished): ");
            answer = scan.nextDouble();
            if (answer != -1) {
                total_cost += answer;
            }

        }

        System.out.print(total_cost);
    }
}
