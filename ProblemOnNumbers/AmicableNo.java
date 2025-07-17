package ProblemOnNumbers;
import java.util.*;
public class AmicableNo {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a  no. :");
    int  n = sc.nextInt();
    int sum = 0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum += i;
        }
    }  
    int prev=0;
    for(int i=1;i<sum;i++){
        if(sum%i==0){
            prev+=i;
        }
    }
    if(prev==n){
        System.out.println("A Amicable Number");
    }
    else{
        System.out.println("Not a Amicable Number");
    }
    sc.close();
   }
}
