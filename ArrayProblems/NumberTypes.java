package ArrayProblems;
import java.util.*;
public class NumberTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.println("enter 20 integers: ");
        for(int i=0; i<20; i++){
            arr[i] = sc.nextInt();
        }
        int pos=0;
        System.out.println("No. of Positive Integers: ");
        for(int i=0;i<20;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+ " ");
                pos++;
            }
        }
        System.out.println("\n"+"Total Positive Integers: "+pos);
        int neg=0;
        System.out.println("No. of Negative Integers: ");
        for(int i=0;i<20;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
                neg++;
            }
        }
        System.out.println("\n"+ "Total Negative No.: "+ neg);
        int ev = 0;
        System.out.println("No of Even No.: ");
        for(int i=0;i<20;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
                ev++;
            }
        }
        System.out.println("\n"+"Total Even No.: "+ev);
        int odd = 0;
        System.out.println("No. of Odd No.: ");
        for(int i=0;i<20;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+ " ");
                odd++;
            }
        }
        System.out.println("\n"+"Total Odd No.: "+ odd);
        sc.close();
    }
}
