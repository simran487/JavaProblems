package ProblemOnNumbers;
import java.util.*;
public class JacobsthalSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1;
        if(n<1){
            System.out.println("enter positive no");
        }
        else if(n==1){
            System.out.println(n1);
        }
        else if(n==2){
            System.out.println(n2);
        }
        else{
            System.out.print(n1+" "+n2+" ");
            for(int i=2;i<n;i++){
                int temp = n2 + (2*n1);
                n1 = n2;
                n2 = temp;
                System.out.print(temp+" ");
            }
        }

        sc.close();
    }
}
