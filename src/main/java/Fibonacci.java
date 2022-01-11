import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n");
        int num = sc.nextInt();
        int sum;
        int t1 = 0,t2 = 1;
       // System.out.println("Fibonacci series for n numbers are" +num);

        while(t1<=num){


            sum = t2+t1;
            t1 = t2;
            t2=sum;
            System.out.println(t1);

        }
    }
}
