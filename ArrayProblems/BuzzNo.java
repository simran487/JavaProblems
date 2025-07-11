package ArrayProblems;
import java.util.*;
public class BuzzNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Buzz No.: ");
        for(int i=0;i<n;i++){
            if(arr[i]%7==0 || arr[i]%10==7){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
    

}
