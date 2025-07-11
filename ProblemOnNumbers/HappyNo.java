package ProblemOnNumbers;
import java.util.*;
public class HappyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0 && n<10){
            sum = 0;
            while(n!=0){
                int temp = n%10;
                sum = sum + (temp*temp);
                n/=10;
            }
            n=sum;
        }
        if(sum==1){
            System.out.println("a Happy No.");
        }
        else{
            System.out.println("not a Happy no. ");
        }
        sc.close();
    }
}
