import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int N = 0;
        for(int i =1;i<=9;i++){
            int X = sc.nextInt();

            if(X>max){
                max = X;
                N = i;
            }
        }
        System.out.println(max);
        System.out.println(N);
        sc.close();
    }
}
