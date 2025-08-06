import java.util.Scanner;

public class S61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        double temp = a;
        int f = 1;
        double p=1;
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=(i*2)-1;j++){
                f*=j;
            }
            double t = temp/f;
            p+=2;
            temp = Math.pow(a,p);
            System.out.print(t+" ");
        }
    }
}
