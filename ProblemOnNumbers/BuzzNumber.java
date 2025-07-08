package ProblemOnNumbers;
import java.util.*;
public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%7==0 || n%10==7){
            System.out.println("Yes, it is Buzz Number");
        }
        else{
            System.out.println("Not, it is not a Buzz Number");
        }
        sc.close();
    }
}
