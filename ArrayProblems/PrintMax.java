package ArrayProblems;
import java.util.*;
public class PrintMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximumm no.: "+ max);
        sc.close();
    }
}
