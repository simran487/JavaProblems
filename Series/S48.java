import java.util.Scanner;

public class S48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        double t = 2;
        double f=1;
        double d = 3;
        double sum=0;
        for(double i=1;i<=n;i++){
            d=d*i;
            for(double j=1;j<=d;j++){
                f*=j;
            }
            System.out.println(t/f);
            t++;
            System.out.println(t);
        }
    }
}
