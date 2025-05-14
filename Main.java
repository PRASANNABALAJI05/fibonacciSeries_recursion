import java.util.Scanner;
public class Main{
    static int num1 = 0, num2 = 1, num3 = 0;
    static void fibbonacciSeries(int count) {
        if (count > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2=num3;
            System.out.print(" " + num3);
            fibbonacciSeries(count-1);
        }
    }
    public static void main(String[] args){
        System.out.print("Please enter the count: ");
        Scanner sc = new Scanner(System.in);        
        int count =sc.nextInt();

        System.out.print(num1 + " " + num2);
        fibbonacciSeries(count-2);

        }
}
