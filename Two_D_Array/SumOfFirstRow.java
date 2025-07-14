package Two_D_Array;
import java.util.*;
public class SumOfFirstRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row & column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("enter the elements: ");
        for(int i =0;i<r;i++){
            for(int j = 0; j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("your matrics : ");
        for(int i =0 ;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("sum of 1st row: ");
        for(int i=0;i<=0;i++){
            for(int j=0;j<c;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
