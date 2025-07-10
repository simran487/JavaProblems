package ProblemOnNumbers;
import java.util.*;
public class SwappingUsing3rdVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no.: ");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd no.: ");
        int n2 = sc.nextInt();
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping:-");
        System.out.print("1st no.: "+" "+n1+'\n');
        System.out.print("2nd no.: "+" "+n2);
        sc.close();
    }
}
