package Slabbing_Related_Problem_Sums;
import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int totalBill = 0;
        if(unit<150){
            totalBill = 200;
        }
        else if(unit>=150 && unit<=400){
            totalBill = 200+((unit-150)*3);
        }
        else if(unit>400 && unit<=700){
            totalBill = 200+(3*(250))+((unit-400)*5);
        }
        else if(unit>700 && unit<=900){
            totalBill = 200+(250*3)+(300*5)+((unit-700)*7);
        }
        else if(unit>900 && unit<=1100){
            totalBill = 200+(250*3)+(300*5)+(200*7)+((unit-900)*10);
        }
        else if(unit>1100){
            totalBill = 200+(250*3)+(300*5)+(200*7)+(200*10)+((unit-1100)*18);
        }
        sc.close();
        System.out.println(totalBill);
    }
}
