package ArrayProblems;
import java.util.*;
public class SumOf10Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 elements: ");
        int[] arr = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        };
        int sum = 0;
        for(int i = 0; i<10; i++){
            sum+=arr[i];
        }
        System.out.println("total sum: "+ sum);
        sc.close();
    }
}
