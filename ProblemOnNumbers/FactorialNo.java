package ProblemOnNumbers;
import java.util.*;
public class FactorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int mul = 1;
        for(int i=1;i<=n;i++){
            mul = mul*i;
        }
        System.out.println(mul);
        sc.close();
    }
}
