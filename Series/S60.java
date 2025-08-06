import java.util.Scanner;

public class S60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        
        int f = 1;
        double total, total1=x;
        double sum = x;
        if(n==1){
            System.out.println(sum);
        }
        else{
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        int p = 3;
        
        for(int i = 1; i<=a;i++){
            f*=i;
        }
        for(int i=1;i<n;i++){
            double xpow = Math.pow(x,p);
            total = xpow/f;
            total1+=total;
            p+=(i*2)-1;
        }
        System.out.println(total1);
    }
    }
}
