package ProblemOnNumbers;
import java.util.*;
public class PadovanSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a limit: ");
        int n = sc.nextInt();
        int n1 = 1, n2 = 1, n3 = 1;
        if(n<1){
            System.out.println("enter a positive limit: ");
        }
        else if (n==1){
            System.out.println(n1);
        }
        else if(n==2){
            System.out.print(n1+" "+n2);
        }
        else if(n==3){
            System.out.print(n1+" "+n2+" "+n3);
        }
        else{
            System.out.print(n1+" "+n2+" "+n3+" ");
            for(int i=3;i<n;i++){
                int temp = n1 + n2;
                System.out.print(temp+" ");
                n1 = n2;
                n2 = n3;
                n3 = temp;
            }
        }
        sc.close();
    }
}
