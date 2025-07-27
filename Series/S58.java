import java.util.Scanner;

public class S58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++){
            int mul = 1;
            for(int j = 1; j<=i;j++){
                mul*=j;
            }
            sum+=mul;
        }
        System.out.println(sum);
    }
}
