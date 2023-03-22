
package Assignments;
import java.util.Scanner;

import java.util.Scanner;
public class Assignment3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a positive integer number:");
        int num = sc.nextInt();
        if (num >= 1 && num <= 200){
            for (int i = 0; i<=num; i++){
                int number = i*i;
                if(number<=num){
                    System.out.print(number + " ");
                }
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
