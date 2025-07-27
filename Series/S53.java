import java.util.Scanner;

public class S53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
       
        double sum = 1, pow1 = 1;
        if(n==1){
            System.out.println(sum);
        }
        else{
            System.out.println("Enter the value of a: ");
            int a = sc.nextInt();
            System.out.println("Enter the value of x: ");
            int x = sc.nextInt();
            for(int i=1;i<n;i++){
                double num = Math.pow(a,pow1);
                pow1 = Math.pow(2,i);
                int m = 2*i;
                int d = m*x;
                double r =num/d;
                System.out.print(r+" "+"\n");
                if(i%2!=0){
                    r*=-1;
                }
                sum+=r;
            }
            System.out.print(sum+" ");
        }
    }
}
