
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 0;
        for(int i = 1; i <= 5; i++){
            int num = sc.nextInt();
            N += num * num;
        }
        int result = N % 10;
        System.out.println(result);

    }
}
