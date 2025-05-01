import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine();
            String[] tokens = line.split(" ");

            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            int c = Integer.parseInt(tokens[2]);

            if(a==0 && b==0 && c==0) break;

            int[] sides = {a,b,c};
            Arrays.sort(sides);

            if(sides[0]*sides[0] + sides[1]*sides[1] == sides[2]*sides[2]){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}
