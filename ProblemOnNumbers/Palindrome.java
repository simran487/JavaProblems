package ProblemOnNumbers;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int on =n;
        int rn = 0;
        while(n>0){
            int d =n%10;
            rn = rn*10+d;
            n= n/10; 
        }
        if(on == rn){
            System.out.println("Yes, it is palindrome");
        }
        else{
            System.out.println("No, it is not palindrome");
        }
        sc.close();
    }
    
}
