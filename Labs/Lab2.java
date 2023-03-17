package Labs;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        num1 = sc.nextInt();
        System.out.print("Enter a positive integer number: ");
        num2 = sc.nextInt();
        if (num1<0 || num2<0){
            System.out.println("Error: Expecting a positive number");
        }
        else if (num1<num2){
            System.out.println("Error: First number must be bigger than the second number");
        }
        else{
            if(num1%num2==0){
                System.out.println(num1 + " is divisble by " + num2 );
            }
            else{
                System.out.println(num1 + " is not divisible by " + num2);
            }
        }
    }
}
