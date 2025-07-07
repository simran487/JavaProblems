package Slabbing_Related_Problem_Sums;
import java.util.*;
public class PurchasePrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        int price = sc.nextInt();
        if(price<1000){
            System.out.println("Pen");
        }
        else if(price>=1000 && price<=2000){
            System.out.println("Bag");
        }
        else if(price>=2000 && price<=4000){
            System.out.println("Pen drive");
        }
        else if(price>4000 && price <=8000){
            System.out.println("Speaker");
        }
        else if(price>8000 && price<=15000){
            System.out.println("Bluetooth");
        }
        else{
            System.out.println("Printer");
        }
        sc.close();
    }
}
