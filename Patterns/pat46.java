package Patterns;
import java.util.*;
public class pat46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i =n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            int m = i*2;
            for(int k=1;k<=i;k++){
                System.out.print(m);
                m-=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
