import java.util.Scanner;
public class S42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        double f = 1; 
        double sum = 0;
        int p=3;
        for(double i=1;i<=n;i++){
            f = 1;
            for(double j = 1;j<=i;j++){
                f = f*j;
            }
            sum+=p/f;
            p+=(i*2);
        }
         System.out.print(sum+" ");
    }
}
