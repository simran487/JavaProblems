package Patterns;
import java.util.*;
public class pat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=n;
            for(int j=1;j<=i;j++){
                System.out.print(k*2+" ");
                k--;
            }
            System.out.println();
        }
        sc.close();
    }
}
