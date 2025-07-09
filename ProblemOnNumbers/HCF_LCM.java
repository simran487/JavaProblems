package ProblemOnNumbers;
import java.util.*;
public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two no.: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int org1 = n1;
        int org2 = n2;
         while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        int lcm = (org1*org2)/n1;
        System.out.println("HCF: "+n1);
        System.out.println("LCM: "+lcm);
    
        sc.close();
    }
}
