package ProblemOnNumbers;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int f1 = 0, f2 = 1, n1=0, n2=1;
        if(n<1){
            System.out.println("enter a valid no.");
        }
        else if(n==1){
            System.out.println(f1);
        }
        else if(n==2){
            System.out.println(f2);
        }
        else{
            System.out.print(f1+" "+f2+" ");
            for(int i=2;i<n;i++){
                int fib = n1+n2;
                n1 = n2;
                n2 = fib;
                System.out.print(fib + " ");
            }
        }
        sc.close();
    }
}
