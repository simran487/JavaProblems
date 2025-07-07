package Slabbing_Related_Problem_Sums;
import java.util.*;
public class calculateCommission {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        int sp = sc.nextInt();
        double commision = 0;
        if(sp<2000){
            commision = sp*0.04;
        }
        else if(sp<=2000 && sp>=5000){
            commision = sp*0.05;
        }
        else if(sp>5000 && sp<=10000){
            commision = sp*0.07;
        }
        else if(sp>10000 && sp<=20000){
            commision = sp*0.09;
        }
        else if(sp>20000 && sp<45000){
            commision = sp*0.15;
        }
        else{
            commision = sp*0.2;
        }
        System.out.println("Commission: " + commision);
        sc.close();
    }
    
}
