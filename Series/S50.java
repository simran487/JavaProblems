import java.util.Scanner;

public class S50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int t=0;
        for(int i=1;i<=n;i++){
            t = t*10+7;
            System.out.print(t+" ");
        }
    }
}