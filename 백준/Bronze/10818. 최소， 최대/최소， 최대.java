
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i = 1; i <= N; i++){
        int X = sc.nextInt();

        if(X>max){
            max = X;
        }
        if(X<min){
            min = X;
        }
    }
    System.out.println(min);
    System.out.println(max);
    sc.close();
    }
}
