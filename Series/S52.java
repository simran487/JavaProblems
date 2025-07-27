import java.util.Scanner;

public class S52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        int p=1 , f=1;
        for(double i=1;i<=n;i++){
            double num = Math.pow(a,p);
            p+=i;
            double d = 2*i;
            for(double j=1;j<=d;j++){
                f *= j;
            }
            double s = num/f;
            System.out.print(s +" ");
        }

    }
}
