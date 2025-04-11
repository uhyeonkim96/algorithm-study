
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int outH = H;
        int outM = M;

        if(M >=45) {
            outM = M - 45;
        } else {
            if(H == 0){
                outH = 23;
            }else{
                outH--;
            }
            outM = (60 + outM) - 45;
        }
        System.out.println(outH + " " + outM);
        sc.close();
    }
}
