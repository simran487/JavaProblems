package ArrayProblems;
import java.util.*;
public class DiffbtwMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.print("Max: "+max+" "+"Min: "+min+"\n");
        System.out.print("Diff b/w Max and Min = "+ (max-min));
        sc.close();
    }
}
