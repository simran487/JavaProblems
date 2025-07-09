package ProblemOnNumbers;
import java.util.*;
public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.: ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while(n!=0){
            int temp = n%10;
            int f = 1;
            for(int i=1;i<=temp;i++){
                f = f*i;
            }
            sum+=f;
            n/=10;
        }

        if(num==sum){
            System.out.println("Peterson Number");
        }
        else{
            System.out.println("Not a Peterson Number");
        }
        sc.close();
    }
}
