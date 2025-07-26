import java.util.Scanner;

public class S49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        double sum =0;
        int p = 2;
        for(int i=1;i<=n;i++){
            double t = 2*i;
            double temp =   Math.pow(a,(p*2)-1);
            p++;
            double t1 = t/temp;
            sum += t1;
        }
        System.out.println(sum);
    }
}
