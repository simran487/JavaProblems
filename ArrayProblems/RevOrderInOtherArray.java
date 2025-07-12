package ArrayProblems;
import java.util.*;
public class RevOrderInOtherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int n2 = n;
        int[] arr2 = new int[n2];
        System.out.println("enter the elements");
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[n2-1] = arr1[i];
            n2--;
        }
        System.out.println("Elements in Reverse Order: ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
