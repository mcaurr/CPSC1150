package Labs;
import java.util.Scanner;
public class Lab10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer number up to 40 digits: ");
        String input = sc.next();
        verifyInput(input);
    }
    public static void verifyInput(String input){
        if(input.length()>= 40){
            System.out.println("Your input is incorrect \n Expecting up to 40 digit number");
        }
        else{
            for (int i = 1; i <input.length(); i++){
                if (input.charAt(i) <'0' || input.charAt(i) >'9'){
                    System.out.println("Your input is incorrect. \n Expecting all digit characters.");
                    return;
                }
            }
            System.out.println("Your input is correct.");
        }    
    }  
}
