import java.util.Scanner;

public class S51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        double d = a*a;
        for(int i=1;i<=n;i++){
            double num = i*2;
            double temp = num/d;
            System.out.print(temp+" ");
        }
    }
}
