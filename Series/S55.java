import java.util.Scanner;

public class S55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int o = 3;
        double f = 1;
        int num = 0;
        double sum = 0, t=0;
        if( n==1){
            System.out.println(sum);
        }
        else{
        for(int i=1;i<=n;i++){
            double d =2*i;
            num += o;
            for(int j=1;j<=d;j++){
                f = f*j;
            }
            t = num/f;
            o+=2;
        }
        sum+=t;
        System.out.println(sum);
    }
    }
}
