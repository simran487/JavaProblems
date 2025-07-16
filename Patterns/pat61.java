package Patterns;
import java.util.*;
public class pat61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==i){
                    System.out.print(1);
                }
                else if((k%2==0 && i%2!=0) || (k%2!=0 && i%2==0)){
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
