package ProblemOnNumbers;
import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int n1 = (int)Math.sqrt(n);
        if(n== (n1*n1)){
            System.out.println("a Perfect Square");
        }
        else{
            System.out.println("Not a Perfect Square");
        }
        sc.close();
    }
}
