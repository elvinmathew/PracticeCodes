import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>=1 && y<=100){
            if(x<=2*y){
                System.out.print("Yes");
            }
            else{System.out.print("No");
            }
        }

    }
}
