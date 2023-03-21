package Assignments;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-9:");
        int number = sc.nextInt();
        for (int i = 1; i<= number; i++){
            for (int j = 0; j<(number -i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
            
        }
    }
    
}
