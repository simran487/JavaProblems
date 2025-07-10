package ProblemOnNumbers;
import java.util.*;
public class CoPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos.: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
            while(n1!=0){
                int temp = n1;
                n1 = n2%n1;
                n2 = temp;   
            }
            if(n2==1){
                System.out.println("Co Prime Numbers");
            }
            else{
                System.out.println("Not a Co Prime Numbers");
            }
            
        
        sc.close();
    }
}
