import java.io.OutputStream;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println("factorial of the number is "+ factorial);
        }

        static int fact(int n){

        int output;
        if (n == 1){
            return 1;
        }
        output = fact(n-1)*n;
        return output;
        }




    }

