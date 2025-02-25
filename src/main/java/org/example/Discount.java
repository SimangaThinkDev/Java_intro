import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        

        // Open the scanner
        Scanner scanner = new Scanner(System.in);
        
        // Vars
        double ticket = 9.99;
        boolean isStudent = false;
        int selector;
        boolean isSenior = false;

        // Prompt the user for input
        System.out.println("Are you? ");
        System.out.println("1. A student\n2. Visitor");
        selector = scanner.nextInt();
        
        if (selector == 1){
            isStudent = true;
        }

        System.out.println("If you're a student ,Are you?: ");
        System.out.println("1. A Junior\n2. A Senior\n3. Skip");
        selector = scanner.nextInt();

        if (selector == 2 && isStudent) {
            isSenior = true;
        }
        
        // Finally the calculations
        if (isStudent && isSenior) {
            System.out.println("\n\n!!SUPER BONUS!!\n");
            System.out.println("Your discount is 35 Percent");
            ticket *= 0.65;
            System.out.printf("Your Ticket Price Is: %.2f\n", ticket);
        } else if (isStudent && !isSenior) {
            System.out.println("\n\n!!BONUS!!\n");
            System.out.println("Your discount is 25 Percent");
            ticket *= 0.75;
            System.out.printf("Your Ticket Price Is: %.2f\n", ticket);
        }
        else {
            System.out.println("Thank you for purchasing with us");
            System.out.printf("Your ticket will be %.2f\n", ticket);
        }

        // Close the scanner
        scanner.close();

    }

}
