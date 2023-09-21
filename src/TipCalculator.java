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

        double answer = 0.0;
        double total_cost = 0.00;
        double total_tip;
        double full_cost;
        double person_before_tip;
        double person_after_tip;
        double cost_per_person;

        while (answer != -1) {
            System.out.print("Enter the cost of the item (enter -1 once finished): ");
            answer = scan.nextDouble();
            if (answer != -1) {
                total_cost += answer;
            }

        }

        total_tip = (total_cost / tip);
        full_cost = (total_cost + total_tip);
        person_before_tip = (total_cost / people);
        person_after_tip = (total_tip / people);
        cost_per_person = (full_cost / people);



        System.out.println(total_cost);
        System.out.println(total_tip);
        System.out.println(full_cost);
        System.out.println(person_before_tip);
        System.out.println(person_after_tip);
        System.out.println(cost_per_person);
    }
}
