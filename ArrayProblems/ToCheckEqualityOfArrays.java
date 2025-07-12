package ArrayProblems;
import java.util.*;
public class ToCheckEqualityOfArrays {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the limit: ");
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    int[] arr2 = new int[n];
    System.out.println("Enter the elements in arr1: ");
    for(int i=0; i<n;i++){
        arr1[i] = sc.nextInt();
    }
    System.out.println("Enter the elements in arr2: ");
    for(int i=0;i<n;i++){
        arr2[i] = sc.nextInt();
    }
    int found = 0;
    for(int i=0;i<n;i++){
        if(arr1[i]!=arr2[i]){
            found++;
        }
    }
    if(found==0){
        System.out.println("Both arrays are equal.");
    }
    else{
        System.out.println("Both arrays are not equal.");
    }
    sc.close();
    }
}
