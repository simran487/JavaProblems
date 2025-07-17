package ProblemOnNumbers;
import java.util.*;
public class DuckNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int found=0;
        for(int i=n;i>0;i=i/10){
            int r = i%10;
            if(r==0){
                found++;
            }
        }
        if(found>0){
            System.out.println("a Duck No.");
        }
        else{
            System.out.println("Not a Duck No.");
        }
        sc.close();
    }
}
