package ArrayProblems;
import java.util.*;
public class PrimeNofromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int found = 0;
        System.out.println("Prime No.");
        for(int i=0;i<n;i++){
            if(arr[i]<2){
                continue;
            }
            for(int j=2;j<=Math.sqrt(arr[i]);j++){
                found = 0;
                if(arr[i]%j==0){
                    found++;
                }
            }
            if(found==0){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
