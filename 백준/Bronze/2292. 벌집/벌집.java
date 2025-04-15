import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        int k = 1;
        long max = 1;

        while (N > max) {
            max += 6L * k;
            k++;
        }
        
        System.out.println(k);
    }
}
