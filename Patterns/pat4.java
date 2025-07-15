package Patterns;
import java.util.*;
public class pat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limits: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int k = n-i+1;
            for(int j=n-i+1;j<=n;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}
