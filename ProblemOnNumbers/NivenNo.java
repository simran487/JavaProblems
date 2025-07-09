package ProblemOnNumbers;
import java.util.*;
public class NivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. : ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while(n!=0){
            int temp = n%10;
            sum+=temp;
            n/=10;
        }
        if(num%sum==0){
            System.out.println("a Niven no.");
        }
        else{
            System.out.println("Not a Niven no.");
        }
        sc.close();
    }
}
