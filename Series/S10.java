import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 1, s1 = 1;
        if(n == 1){
            System.out.println(sum);
        }
        else{
            for(int i=1;i<n;i++){
                s1+=i;
                sum+=s1;

            }
            System.out.println(sum);
        }
    }
}
