package Labs;
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year greater than 1582: ");
        String day = ""; 
        int year = sc.nextInt();
        if (year> 1582){
            int result = zeller(year, 1, 1);
            switch (result){
                case 0 :
                day = "Sunday"; 
                break;
                case 1 :
                day = "Monday"; 
                break;
                case 2 :
                day = "Tuesday"; 
                break;
                case 3 :
                day = "Wednesday"; 
                break;
                case 4 :
                day = "Thursday"; 
                break;
                case 5 :
                day = "Friday";
                break; 
                case 6 :
                day = "Saturday"; 
                break;
            }
        }
        else {
            System.out.println("Invalid year input");
        }
        System.out.println("The first day of January " + year + " is on " + day);
    }
    public static int zeller(int year, int month, int date){
        int startMonth;
        int startYear;
        if (month<3){
            startMonth = 0;
            startYear = year - 1;
        }
        else {
            startMonth = (int) ((0.4 * month) + 2.3);
            startYear = year;
        }
        int leapFactor = (startYear/4) - (startYear/100) + (startYear/400);
        int dayNumber = (((365 * year + 31 * (month - 1) + date + leapFactor - startMonth) - 1)) % 7;
        
        return dayNumber;
    }
}
