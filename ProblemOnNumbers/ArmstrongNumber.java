package ProblemOnNumbers;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0, count = 0, temp = n;
        while(temp!=0){
            count++;
            temp/=10;
        }
        temp = n;
        while(temp!=0){
            int no = temp%10;
            sum+=Math.pow(no,count);
            temp/=10;
        }
        if(original==sum){
            System.out.println("Yes it is an Armstrong Number");
        }
        else{
            System.out.println("No, it is not a Armstrong Number");
        }
        sc.close();
    }
}
