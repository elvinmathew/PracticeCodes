
    import java.util.*;
import java.lang.*;
import java.io.*;


    class Codechef3
    {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int T = a+b;
                if(a>=0 && b<=10000){
                    if (T<=10000 && T>=1){
                        System.out.println(a+b);
                    }

                }

            }

        }
    }



