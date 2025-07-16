package Patterns;
import java.util.*;
public class pat88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print(1);
                }
                else if((j%2==0 && i%2!=0) || (j%2!=0 && i%2==0)){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
