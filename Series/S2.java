package Series;
public class S2 {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0;
        for(double i=n, j=1;i>=1 && j<=n ;i--, j++){
            double t = j/n;
            sum +=t;  
        }
        System.out.println(sum);
    }
}
