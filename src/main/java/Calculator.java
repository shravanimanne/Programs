import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter two numbers");
        double first = read.nextDouble();
        double second = read.nextDouble();
        System.out.println("enter an operator(+,-,/,*,%");
        char operator = read.next().charAt(0);
        double result = 0.0;
        switch (operator){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case    '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            default:
                System.out.println("invalid operator");
        }
        System.out.println("result is " + result);
    }

}
