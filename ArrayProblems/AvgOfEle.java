package ArrayProblems;
import java.util.*;
public class AvgOfEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Average: ");
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        float avg = sum/n;
        System.out.println(avg);
        sc.close();
    }
}
