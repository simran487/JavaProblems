package ProblemOnNumbers;
import java.util.*;
public class RepunitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int found = 0;
        while(n!=0){
            int temp = n%10;
            if(temp!=1){
                found++;
            }
            n/=10;
        }
        if(found!=0){
            System.out.println("Not a Repunit No.");
        }
        else{
            System.out.println("a Repunit No.");
        }
        sc.close();
    }
}
