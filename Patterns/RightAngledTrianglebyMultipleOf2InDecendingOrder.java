package Patterns;
import java.util.*;
public class RightAngledTrianglebyMultipleOf2InDecendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j*2+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
