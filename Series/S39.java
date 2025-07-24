import java.util.Scanner;
public class S39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        double f = 1; 
        float sum = 0;
        for(double i=1;i<=n;i++){
            f = 1;
            for(double j = 1;j<=i;j++){
                f = f*j;
            }
            sum+=1/f;
        }
         System.out.print(sum+" ");
    }
}
