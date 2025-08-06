import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units: ");
        int u = sc.nextInt();
        if(u<=100){
            System.out.println(u*2);
        }
        else if(u>100 && u<=200){
            double price = (u-100)*1.80+2*100;
            System.out.println(price);
        }
        else{
            double price = 100*2+100*1.80+(u-200)*1.50;
            System.out.println(price);
        }
    }
}
