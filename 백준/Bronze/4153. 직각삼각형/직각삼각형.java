import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == 0 && b ==0 && c ==0){
                break;
            }

        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);

        if(sides[0]*sides[0]+sides[1]*sides[1]==sides[2]*sides[2]){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
        }
        sc.close();

    }
}
