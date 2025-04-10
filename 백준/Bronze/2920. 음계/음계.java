import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];

        for(int i = 0; i < 8; i++){
            num[i] = sc.nextInt();
        }

        boolean isAsc = true;
        boolean isDesc = true;

        for(int i = 0; i < 7; i++){
            if(num[i] > num[i+1]){
                isAsc = false;
            }else if(num[i] < num[i+1]){
                isDesc = false;
            }
        }

        if(isAsc){
            System.out.println("ascending");
        }else if(isDesc){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
        sc.close();
    }

}
