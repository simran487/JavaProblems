package ArrayProblems;
import java.util.*;
public class DiffOf2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] diff = new int[n];
        System.out.println("enter the elements in arr1: ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elements in arr2: ");
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Difference: ");
        for(int i=0;i<n;i++){
            diff[i] = arr1[i] - arr2[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(diff[i]+" ");
        }

        sc.close();
    }
}
