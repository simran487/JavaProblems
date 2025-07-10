package ProblemOnNumbers;
import java.util.*;
public class NelsonNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        if(n<100 || n>1000){
            System.out.println("Not a Nelson No");
        }
        else{
            int found =0;
            int temp = n%10;
            while(n!=0){
                int t1 = n%10;
                if(t1==temp){
                    found++;
                }
                n/=10;
            }
            if(found==3){
                System.out.println("a Nelson No.");
            }
            else{
                System.out.println("Not a Nelson No");
            }
        }
        sc.close();
    }
}
