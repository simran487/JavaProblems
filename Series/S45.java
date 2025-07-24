import java.util.Scanner;

public class S45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int t = 0, sum=0;
        for(int i=1;i<=n;i++){
            t=t*10+i;
            sum+=t;
        }
        System.out.println(sum);
    }
}
