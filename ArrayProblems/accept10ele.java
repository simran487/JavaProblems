package ArrayProblems;
import java.util.*;
public class accept10ele {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the 10 elements: ");
    int[] arr = new int[10];
    for(int i=0;i<10;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Your Elements are:- ");
    for(int i=0;i<10;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
   } 
}
