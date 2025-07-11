package ProblemOnNumbers;
import java.util.*;
public class ISBNno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        String n = sc.nextLine();
        int n1 = Integer.valueOf(n);
        int count = 1;
        long num = n1, sum = 0;
        while(n1>0){
            count++;
            n1/=10;
        }
        System.out.println(count);
        if(count==10){
            for(int i=1;i<count;i++){
                long temp = num%10;
                long mul=temp*i;
                sum=sum + mul;
                num/=10;
            }
            System.out.println(sum);
            if(sum%11==0){
                System.out.println("a Valid ISBN No.");
            }
            else{
                System.out.println("Not a Vaild ISBN No.");
            }
        }
        else{
            System.out.println("Not a Valid ISBN No.");
        } 
        sc.close();
    }
}
