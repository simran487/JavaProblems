package Patterns;
import java.util.*;
public class pat19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int m=1;
            for(int k=1;k<=i;k++){
                System.out.print(m);
                m =m+2;
                
            }
            System.out.println();
        }
        sc.close();
    }
}
