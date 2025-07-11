package ProblemOnNumbers;
import java.util.*;
public class DisariumNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int num = n, num1=n, count =0, sum=0;
        while(n!=0){
            count++;
            n/=10;
        }
        for(int i=count;i>=1;i--){
            int temp = num%10;
            int mul = (int)Math.pow(temp,i);
            sum=sum+mul;
            num/=10;
        }
        
        if(sum==num1){
            System.out.println("a Disarium No.");
        }
        else{
            System.out.println("Not a Disarium No.");
        }
        sc.close();
    }
}
