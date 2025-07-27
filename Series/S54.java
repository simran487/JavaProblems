import java.util.Scanner;

public class S54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of of x: ");
        int x = sc.nextInt();
        int p = 5;
        for(int i=1;i<=n;i++){
            int pow = i*5;
            double num = Math.pow(x,pow);
            double d = Math.pow(i,2);
            double t = num/d;
            System.out.print(t+" ");
        }
    }
}
