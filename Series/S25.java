public class S25 {
    public static void main(String[] args) {
        float sum = 0;
        for(float i=1;i<=20;i+=2){
            sum+=(1/((i*2)-1));
        }
        System.out.println(sum);
    }
}
