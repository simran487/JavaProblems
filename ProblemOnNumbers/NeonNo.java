package ProblemOnNumbers;
import java.util.*;
public class NeonNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int n1 = n*n;
        int sum = 0;
        while(n1!=0){
            int temp = n1%10;
            sum+=temp;
            n1/=10;
        }
        if(n==sum){
            System.out.println("a Neon No.");
        }
        else{
            System.out.println("Not a Neon No.");
        }
        sc.close();
    }
}
