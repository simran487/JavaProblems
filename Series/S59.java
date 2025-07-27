import java.util.Scanner;

public class S59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        int mul=1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                mul*=j;
        }
        }
        System.out.println(mul);
    }
}
