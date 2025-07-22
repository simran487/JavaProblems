import java.util.Scanner;

public class S13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;
        int sum = 0;
        for(int i =1;i<=n;i++){
            t*=i;
            sum+=t;
        }
        System.out.println(sum);
    }
}
