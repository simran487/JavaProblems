package ProblemOnNumbers;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int digits = n%10;
            sum = sum+digits;
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
