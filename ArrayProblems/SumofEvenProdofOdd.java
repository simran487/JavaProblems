package ArrayProblems;
import java.util.*;
public class SumofEvenProdofOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0, prod = 1;
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
            else{
                prod*=arr[i];
            }
        }
        System.out.println("Sum of Even No.: "+sum);
        System.out.println("Product of Odd No.: " + prod);
        sc.close();
    }
}
