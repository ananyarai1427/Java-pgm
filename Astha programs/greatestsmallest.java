import java.util.Scanner;

public class greatestsmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int smallest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;
        
        System.out.println("Enter numbers (enter 0 to terminate input):");
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num == 0) {
                break; // Exit the loop when 0 is entered
            }
            
            if (num < smallest) {
                smallest = num;
            }
            
            if (num > greatest) {
                greatest = num;
            }
        }
        
        if (smallest == Integer.MAX_VALUE || greatest == Integer.MIN_VALUE) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("Smallest number: " + smallest);
            System.out.println("Greatest number: " + greatest);
        }
        
        scanner.close();
    }
}
