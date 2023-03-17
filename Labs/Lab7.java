package Labs;
import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args){
        int[] numbers = new int[20];
        initializeArray(numbers);
        System.out.println("The random numbers are:");
        displayArray(numbers);
        System.out.println("The smallest number in the list : " + getSmallest(numbers));
        System.out.println("The average of the array elements is: " + getAverage(numbers));
        reverseArray(numbers);
        System.out.println("The random numbers in reverse are:");
        displayArray(numbers);
    
    }
    
    public static void initializeArray(int [] numbers){
        for (int i = 0; i <numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
    }
    public static void displayArray(int [] numbers){
        for (int i = 0; i <numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static int getSmallest(int [] numbers){
        int smallest = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if (numbers[i]< smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static int getAverage(int [] numbers){
        int sum = 0;
        for(int i =1; i< numbers.length; i++){
            sum = sum + numbers[i];
        }
        int total = numbers.length;
        int average = (int) (sum/total);
        return average; 
        
    }
    public static void reverseArray(int[] numbers){
        for (int i = 0; i < (numbers.length/2); i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i -1];
            numbers[numbers.length - i - 1] = temp;
        }
    }
}
