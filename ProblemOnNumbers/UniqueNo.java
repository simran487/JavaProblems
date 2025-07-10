package ProblemOnNumbers;
import java.util.*;
public class UniqueNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        int c = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0 , c6 = 0, c7 = 0, c8 = 0, c9 = 0;
        while(n!=0){
            int temp = n%10;
            if(temp==0){
                c++;
            }
            else if(temp==1){
                c1++;
            }
            else if(temp==2){
                c2++;
            }
            else if(temp==3){
                c3++;
            }
            else if(temp==4){
                c4++;
            }
            else if (temp==5) {
                c5++;
            }
            else if(temp==6){
                c6++;
            }
            else if(temp==7){
                c7++;
            }
            else if(temp==8){
                c8++;
            }
            else if(temp==9){
                c9++;
            }
            n/=10;
        }
        if(c<=1 && c1<=1 && c2<=1 && c3<=1 && c4<=1 && c5<=1 && c6<=1 && c7<=1 && c8<=1 && c9<=1){
            System.out.println("a Unique No.");
        }
        else{
            System.out.println("Not a Unique No.");
        }
        sc.close();
    }
}
