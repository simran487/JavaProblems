package ArrayProblems;
import java.util.*;
public class ReversedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            int m = arr[i];
            int rev = 0;
            int temp = 0;
            while(m!=0){
                temp = m%10;
                rev = rev*10+temp;
                m/=10;
            }
            arr[i] = rev;
        }
        System.out.println("After Reversing the elements: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
