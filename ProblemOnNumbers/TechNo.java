package ProblemOnNumbers;
import java.util.*;
public class TechNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.:");
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            int temp = n%10;
            count++;
            n/=10;
        }
        if(count%2==0){
            int temp = count/2;
            while(count!=0){
                
            }
        }
    }
}
