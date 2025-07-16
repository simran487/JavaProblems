package Patterns;
import java.util.*;
public class pat57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int x = 1;
        int m = x;
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(m);
                m++;
            }
            m = x+1;
            x++;
            System.out.println();
        }
        sc.close();
    }
}
