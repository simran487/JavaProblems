import java.util.Scanner;

public class S41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n= sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        int t = 1;
        for(int i=1;i<=n;i++){
            int f =(int)Math.pow(x,t);
            System.out.print(f+" ");
            t+=i;
        }
    }
}
