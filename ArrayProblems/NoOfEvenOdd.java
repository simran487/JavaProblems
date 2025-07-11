package ArrayProblems;
import java.util.*;
public class NoOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int evno = 0, oddno = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evno++;
            }
            else{
                oddno++;
            }
        }
        System.out.println("No. of Odds: "+ oddno);
        System.out.println("No. of Even: "+ evno);
        sc.close();
    }
}
