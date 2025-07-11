package ArrayProblems;
import java.util.*;
public class ProdOf10Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 elements: ");
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int prod = 1;
        for(int i = 0 ; i<10 ; i++){
            prod*=arr[i];
        }
        System.out.print("Product: "+" "+prod);
        sc.close();
    }
}
