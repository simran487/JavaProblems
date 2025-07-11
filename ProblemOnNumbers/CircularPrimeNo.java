package ProblemOnNumbers;
import java.util.*;
public class CircularPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0, num = n;
        while(n!=0){
            count1++;
            n/=10;
        }
        int totalcount = 0, count = count1;
        while(count!=0){
            int found = 0;
            int temp = num%10;
            num/=10;
            int no = (int)Math.pow(10, count1-1);
            int newno = no*temp+num;
            num = newno;
            count--;
            System.out.println(newno);
            for(int i = 2;i<=newno;i++){
                if(newno%i==0){
                    found++;
                }
            }
            if(found==1){
                totalcount++;
            }
        }
        if(totalcount== count1){
            System.out.println("a Circular Prime No.");
        }
        else{
            System.out.println("Not a Circular Prime No.");
        }
        sc.close();
    }
}
