import java.util.*;

public class P2 {

    void mat(int[] arr){
        int p = arr.length;
        int mat[][] = new int[p][p];
        
        for(int i = 0;i<p;i++){
            for(int j=0;j<p-i;j++){
                mat[i][j]=arr[j];
            }
            
            for(int k=0;k<i;k++){
                mat[i][p-i+k]=arr[k];
            }
        }

        System.out.println("IN MATRIX FORM: ");

        for(int i =0;i<p;i++){
            for(int j=0;j<p;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();
        if(n>2 && n<10){
            P2 obj = new P2();
            int arr[] = new int[n];
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("After sorting: ");
            for(int i = 0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            obj.mat(arr);
        }
        else{
            System.out.println("please enter the range between 2 and 10.");
        }
    }
}
