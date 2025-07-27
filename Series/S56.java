import java.util.Scanner;

public class S56 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n  = sc.nextInt();
        int t = 0, sum = 0;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
