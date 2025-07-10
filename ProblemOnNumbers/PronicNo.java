package ProblemOnNumbers;
import java.util.*;
public class PronicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.: ");
        int n = sc.nextInt();
        int found = 0;
        for(int i=1;i<n;i++){
            if((i*(i+1))==n){
                System.out.println(i +" "+ (i+1));
                found++;
            }
        }
        if(found==0){
            System.out.println("not a pronic no.");
        }
        sc.close();
    }
}
