package Demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args) {
        System.out.println("enter names");
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String[] name=input.split("\\s+");

        System.out.println(Arrays.toString(name));
    }
}
