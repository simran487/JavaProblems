package Two_D_Array;
import java.util.*;
public class SumofNonBoundaryElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and coulmn: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter the elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of Non Boundary Elements: ");
        int sum = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i!=0 && i!=r-1 && j!=0 && j!=c-1){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
