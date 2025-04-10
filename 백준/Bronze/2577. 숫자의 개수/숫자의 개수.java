import java.util.Scanner;

public class Main {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int[] count = new int[10];

    String result = Integer.toString(A*B*C);

    for(int i = 0; i < result.length(); i++){
        int digit = result.charAt(i) - '0';
        count[digit]++;
    }

    for(int j = 0; j < count.length; j++){
        System.out.println(count[j]);
    }
   }

}
