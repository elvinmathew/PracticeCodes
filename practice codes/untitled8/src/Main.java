import java.util.Scanner;

class Factorial {

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int number = sc.nextInt() , result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}