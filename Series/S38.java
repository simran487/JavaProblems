import java.util.Scanner;
public class S38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int f = 1, sum = 0;
        for(int i=1;i<=n;i++){
            f = 1;
            for(int j = 1;j<=i;j++){
                f = f*j;
            }
            sum+=f;
        }
         System.out.print(sum+" ");
    }
}
