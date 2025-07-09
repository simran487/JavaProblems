package ProblemOnNumbers;
import java.util.*;
public class odd {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("odd no.");
        }
        else{
            System.out.println("not a odd no.");
        }
        sc.close();
    }
    
}
