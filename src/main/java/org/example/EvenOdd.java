import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args) {
        
        //Scannnnnnnner
        Scanner scanner =  new Scanner(System.in);

        int user;
        System.out.print("Enter a number: ");
        user = scanner.nextInt();

        // Evaluate
        if (user % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


        // Close the scanner
        scanner.close();

    }

}
