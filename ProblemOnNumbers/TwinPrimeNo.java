package ProblemOnNumbers;
import java.util.*;
public class TwinPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two nos.: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<2 || n2<2){
            System.out.println("Neither prime nor twin prime.");
        }
        else{
            int found = 0;
            for(int i=2;i<n1;i++){
                if(n1%i==0){
                    found++;
                }
            }
            int newfound=0;
            for(int i=2;i<n2;i++){
                if(n2%i==0){
                    newfound++;
                }
            }
            int diff = 0;
            if(found==0 && newfound==0){
                diff = n1 - n2;
                if(diff==2 || diff==-2){
                    System.out.println("Twin Prime No.");
                } 
                else{
                    System.out.println("Not a Twin Prime No.");
                }
            }
        }
        sc.close();
    }
}
