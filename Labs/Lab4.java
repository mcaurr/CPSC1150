package Labs;

public class Lab4 {
    public static void main(String[] args) {
        System.out.println("The first 10 pentagonal numbers :");
        for (int i = 1; i<=10; i++){
            System.out.print(getPentagonalNumber(i) + " ");
        }
    }

    public static int getPentagonalNumber(int num){
        int pentNumber = (num * ((3 * num) - 1)) / 2;
        return pentNumber;
    }
}
