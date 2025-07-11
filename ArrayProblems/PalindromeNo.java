package ArrayProblems;
import java.util.*;
public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit:");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Palindrome No: ");
        int m;
        for(int i =0;i<n;i++){
            m = arr[i];
            int rem =0;
            while(m!=0){
                int temp = m%10;
                rem = rem*10+temp;
                m/=10;
            }
            if(rem==arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
