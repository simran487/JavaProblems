// package Slabbing_Related_Problem_Sums;

import java.util.*;

public class Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 integers: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        if((i1*i1) + (i2*i2)== i3*i3 || (i2*i2) + (i3+i3) == i1*i1 || (i1*i1) + (i3*i3) == i2*i2){
            System.out.println("Pythagoren Triplet");
        }
        else{
            System.out.println("Not a Pythagoren Triplet");
        }
    
    }
}
