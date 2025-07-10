package ProblemOnNumbers;
import java.util.*;
public class TwistedPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n;
        if(n<=1){
            System.out.println("Not a Twisted prime no.");
        }
        else{
        int rem = 0;
        while(n!=0){
            int temp = n%10;
            rem = rem*10+temp;
            n/=10;
        }
        int revfound = 0;
        for(int i=2;i<rem;i++){
            if(rem%i==0){
                revfound++;
                break;
            }
        }
        int found = 0;
        for(int i=2;i<n1;i++){
            if(n1%i==0){
                found++;
                break;
            }
        }
        if(found==0 && revfound==0){
            System.out.println("Twisted Prime no.");
        }
        else{
            System.out.println("Not a Twisted Prime no.");
        }
        }
        sc.close();
    }
}
