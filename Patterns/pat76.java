package Patterns;
import java.util.*;
public class pat76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i*2);
            }
            System.out.println();
        }
        sc.close();
    }
}
