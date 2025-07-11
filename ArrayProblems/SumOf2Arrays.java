package ArrayProblems;
import java.util.*;
public class SumOf2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the elements in arr1: ");
        int[] arr1 = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr1[i] = sc.nextInt(); 
        }
        System.out.println("enter the elements in arr2: ");
        int[] arr2 = new int[n];
        for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        int[] sum = new int[n];
        for(int i=0;i<n;i++){
            sum[i] = arr1[i] + arr2[i];
        }
        System.out.println("Sum: ");
        for(int i =0; i<n; i++){
            System.out.print(sum[i]+" ");
        }
        sc.close();
    }
}
