import java.util.Scanner;

public class S60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        int f = 1;
        for(int i = 1; i<=a;i++){
            f*=i;
        }
    }
}
