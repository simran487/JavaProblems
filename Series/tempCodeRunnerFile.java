import java.util.*;
public class S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        double sum = 0.0;
        double t=0.0;
        for(int i=1, j=2, k=1;k<=n;i++,j++,k++){
             t = i/j;
            sum+=t;
        }
        System.out.println(sum);
        sc.close();
    }
}
