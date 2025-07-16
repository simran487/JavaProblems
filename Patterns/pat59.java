package Patterns;
import java.util.*;
public class pat59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int m = 1;
        int x = m;
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(m);
                m+=2;
            }
            m = x+2;
            x+=2;
            System.out.println();
        }
        sc.close();
    }
}
