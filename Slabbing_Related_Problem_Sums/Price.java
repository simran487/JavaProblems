package Slabbing_Related_Problem_Sums;
import java.util.*;
public class Price {
    public static void main(String[] args) {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        int pp = sc.nextInt();
        double discount = 0;
        double disPrice = 0;
        if(pp<1000){
            discount = pp*0.02;
        }
        else if(pp>=1000 && pp<=2000){
            discount = pp*0.03;       
         }
        else if(pp>2000 && pp<=4000){
            discount = pp*0.05;
        }
        else if(pp>4000 && pp<=8000){
            discount = pp*0.05;
        }
        else if(pp>8000 && pp<=15000){
            discount = pp*0.11;
        }
        else{
            discount = pp*0.15;
        }
        disPrice = pp-discount;
        sc.close();
        System.out.println("Discount : "+ discount);
        System.out.println("Discount Price : "+ disPrice);
    }
    
}
