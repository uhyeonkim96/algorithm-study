import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getGCD(a,b));
        System.out.println(getLCM(a,b));

        sc.close();
    }
    public static int getGCD(int a, int b){
        while(b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int getLCM(int a, int b){
        return a * b / getGCD(a,b);
    }
}
