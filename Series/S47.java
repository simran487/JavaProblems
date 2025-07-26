import java.util.Scanner;

public class S47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        double temp, sum=0;
        for(double i=1;i<=n;i++){
            double t =Math.pow(x,(2*i)-1);
            if(i%2==0){
                temp = -1*(1/t);
                sum+=temp;
            }
            else{
                sum+=(1/t);
            }
            
        }
        System.out.println(sum);
    }
}
