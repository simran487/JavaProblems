package ProblemOnNumbers;
import java.util.*;
public class PrimeFiboNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit: ");
        int n = sc.nextInt();
        int f1 = 1, f2 = 1;
                while(n>0){
                    int temp = f1+f2;
                    int t1 = temp;
                    int found = 0;
                    for(int i=2;i<=temp;i++){
                        if(t1%i==0){
                            found++;
                        }
                    }
                    if(found==1){
                        System.out.print(temp+" ");
                        n--;
                    }
                    f1=f2;
                    f2=temp;
                }
        sc.close();
    }
}
