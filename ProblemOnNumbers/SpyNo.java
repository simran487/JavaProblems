package ProblemOnNumbers;
import java.util.*;
public class SpyNo {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no.: ");
    int n = sc.nextInt();
    int count = 0;
    while(n>0){
        // int temp = n%2;
        // if(temp==1){
        //     count++;
        // }
        if(n%2==1)  count++;
        n/=2;
    }
    if(count%2==0){
        System.out.println("a Spy No");
    }
    else{
        System.out.println("Not a Spy No");
    }
    sc.close();
   } 
}
