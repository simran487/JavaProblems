package ProblemOnNumbers;
import java.util.*;
public class BouncyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }   
        int count1 = count;
        int temp = num%10;
        num/=10;
        int inc = 0, dec = 0;
        for(int i=(count-1);i>0;i--){
            int temp1 = num%10;
            if(temp>=temp1){
                inc++;
            }
            else if(temp<=temp1){
                dec++;
            }
            temp=temp1;
            num/=10;
        }
        if(inc==(count1-1) || dec==(count1-1)){
            System.out.println("a Bouncy No.");
        }
        else{
            System.out.println("Not a Bouncy No.");
        }
        sc.close();
    }
}
