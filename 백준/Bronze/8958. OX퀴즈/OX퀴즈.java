
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       for(int i = 0; i < num; i++){
           String score = sc.next();

           int result = 0;
           int count = 0;
           for(int j = 0; j < score.length(); j++){
               if(score.charAt(j) == 'X'){
                   count = 0;
               }else{
                   count++;

               }
               result += count;
           }
           System.out.println(result);
       }

       sc.close();
   }
}
