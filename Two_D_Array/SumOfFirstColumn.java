package Two_D_Array;
import java.util.*;
public class SumOfFirstColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[][] mat = new int[r][c];
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
        int sum=0;
        System.out.println("sum of 1st column: ");
        for(int i =0;i<r;i++){
            for(int j=0;j<=0;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
