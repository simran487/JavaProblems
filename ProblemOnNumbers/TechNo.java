package ProblemOnNumbers;
import java.util.*;
public class TechNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.:");
        int num = sc.nextInt();
        int n = num;
        int count = 0;
        
        while(n!=0){
            count++;
            n/=10;
        }
        if(count%2==0){
            int temp1 = count/2;
            int p = (int)Math.pow(10,temp1);
            int t = num%p;
            int t1 = num/p;
            int sum = t + t1;
            int sq = sum*sum;
            if(sq==num){
                System.out.println("A Tech no.");
            }
            else{
                System.out.println("Not a Tech no.");
            }
        }
        sc.close();
    }
}
