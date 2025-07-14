package Patterns;
import java.util.*;
public class RightAngledTrianglebyOddNoInDecendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j*j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
