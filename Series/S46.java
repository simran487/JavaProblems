import java.util.Scanner;

public class S46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print((int)Math.pow(x,2*i)+" ");
        }
    }
}
