import java.util.Arrays;
import java.util.Scanner;

public class ArrMInMac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        int[] minmax={input};
        System.out.println(Arrays.stream(minmax).min());
        System.out.println(Arrays.stream(minmax).max());

    }
}
