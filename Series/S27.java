public class S27 {
    public static void main(String[] args) {
        float sum = 1;
        for(float i=1;i<=19;i+=2){
            sum+=(i/(i+1));
        }
        System.out.println(sum);
    }
}
