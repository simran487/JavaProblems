package Patterns;
import java.util.*;
public class pat23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                int m = (i*2)-1;
                System.out.print(m);
            }
            System.out.println();
        }
        sc.close();
    }
}
