package Patterns;
import java.util.*;
public class pat32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int m = (2*n)-(2*i)+1;
            for(int k = 1;k<=i;k++){
                System.out.print(m);
                m+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
