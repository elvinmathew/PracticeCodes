import java.util.Scanner;

public class LoopQues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int N=sc.nextInt();

        for(int i=0;i<=10;i++){
            int result= N*i;
            System.out.println(N+" x "+i+" = "+result);
            
        }
    }
}
