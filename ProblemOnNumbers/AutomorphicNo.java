package ProblemOnNumbers;
import java.util.*;
public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int sq = n*n;
        int n1=n;
        int digit =0;
        while(n1>0){
            digit++;
            n1/=10;
        }
        int val = (int) Math.pow(10,digit);
        int found = sq%val;
        if(found==n){
            System.out.println("a Automorphic No.");
        }
        else{
            System.out.println("Not a Automorphic No.");
        }
        sc.close();
    }
}
