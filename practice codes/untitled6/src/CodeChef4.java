import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z=x+y;
            if(x>=1 && x<=6&& y>=1 && y<=6){
                if(z>6){

                System.out.println("YES");

            }else{System.out.println("NO");
            }
        }

    }
}}
