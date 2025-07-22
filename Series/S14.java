import java.util.Scanner;

public class S14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1, s=0; 
        for(int i = 1;i<=n;i++){
            t*=i;
            if(i%2==0){
                s-=t;
            }
            else{
                s+=t;
            }
        }
        System.out.println(s);
    }
}
