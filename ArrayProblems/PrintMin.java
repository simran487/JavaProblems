package ArrayProblems;
import java.util.*;
public class PrintMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0; i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum no.: "+ min);
        sc.close();
    }
}
