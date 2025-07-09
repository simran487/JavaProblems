package ProblemOnNumbers;
import java.util.*;
public class TribonacciSeries {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no.:");
    int n =sc.nextInt();
    int n1 = 0, n2 = 1, n3 = 1;
    if(n<1){
        System.out.println("enter a valid no.");
    }
    else if(n==1){
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
        for(int i=4;i<=n;i++){
            int tri = n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=tri;
            System.out.print(tri+" ");
        }
    }
        sc.close();
    }
}
