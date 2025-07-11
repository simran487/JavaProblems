package ProblemOnNumbers;
import java.util.*;
public class UglyNo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        if(n%2==0 && n%3==0 && n%5==0){
            System.out.println("A Ugly No.");
        }
        else{
            System.out.println("Not a Ugly No.");
        }
        sc.close();
    }
}
