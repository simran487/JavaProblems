package ProblemOnNumbers;
import java.util.*;
public class MagicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int temp = n%10;
            sum+=temp;
            n=n/10;
        }
        if(sum%10==0 || sum==1){
            System.out.println("a Magic no.");
        }
        else{
            System.out.println("not a Magic No.");
        }
        sc.close();
    }
}
