package Patterns;
import java.util.*;
public class pat30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int m = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            } 
            int q = (m+1)-i;
            for(int k=1;k<=i;k++){
                System.out.print(q);
                q++;
            }
            
            System.out.println();
        }
        sc.close();
    }
}
