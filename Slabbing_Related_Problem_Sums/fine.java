package Slabbing_Related_Problem_Sums;
import java.util.*;
public class fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt(); 
        int f9 = 0;
        if(days<10){
            f9 = 0;
        }
        else if(days>=10 && days<=20){
            f9 = ((days-10)*2);
        }
        else if(days>=21 && days<=35){
            f9 =(10*2)+((days-20)*3);
        }
        else if(days>=36 && days<=50){
            f9 = (10*2)+(15*3)+((days-35)*5);
        }else if(days>=51 && days<=90){
            f9 = (10*2)+(15*3)+(15*5)+((days-50)*8);
        }
        else{
            f9 = (10*2)+(15*3)+(15*5)+(40*8)+((days-90)*12);
        }
        System.out.println(f9);
        sc.close();
    }
    
}
