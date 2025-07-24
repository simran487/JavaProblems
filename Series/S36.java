import java.util.Scanner;
public class S36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            double t1 = Math.pow(y,(2*i)-1);
            double t2 = Math.pow(x,i*2);
            double temp = t1/t2;
            sum+=temp;
        }
        System.out.println(sum);
    }
}
