package Patterns;
public class pat63 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==3){
                    System.out.print("#"+" ");
                }
                if(i==2 || i==5){
                    System.out.print("@"+" ");
                }
                else if(i==4){
                    System.out.print("?"+" ");
                }
            }
            System.out.println();
        }
    }
}
