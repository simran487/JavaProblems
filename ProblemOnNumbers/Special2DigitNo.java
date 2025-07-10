package ProblemOnNumbers;
import java.util.*;
public class Special2DigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        int n1 = n;
        int sum = 0, prod = 1;
        while(n>0){
            int temp = n%10;
            sum+=temp;
            prod*=temp;
            n/=10;
        }
        int total =sum+prod;
        if(total==n1){
            System.out.println("It is Special Two Digit No");
        }
        else{
            System.out.println("Not a Special two digit No");
        }
        sc.close();
    }
}
