package Patterns;
import java.util.*;
public class pat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int k=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
            }
            k--;
            System.out.println();
        } 
        sc.close();   
    }
}
