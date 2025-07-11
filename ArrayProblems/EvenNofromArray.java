package ArrayProblems;
import java.util.*;
public class EvenNofromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Even no:");
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
