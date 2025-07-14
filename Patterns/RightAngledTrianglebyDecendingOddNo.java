package Patterns;
import java.util.*;
public class RightAngledTrianglebyDecendingOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print((j*2)-1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
