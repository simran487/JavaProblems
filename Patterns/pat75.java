package Patterns;
import java.util.*;
public class pat75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i = n;i>=1;i--){
            int m = i;
            for(int j = 1; j<=i;j++){
                System.out.print(m*m);
                m--;
            }
            System.out.println();
        }
        sc.close();
    }
}
