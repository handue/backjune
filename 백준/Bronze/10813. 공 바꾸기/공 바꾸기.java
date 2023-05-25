import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); //바구니의 개수
        int M = scan.nextInt(); // 공을 바꿀 횟수
        ArrayList List = new ArrayList();
        for (int a=0; a<N; a++){
            List.add(a, a+1);
        }

        for(int a=0; a<M; a++){
            int i = scan.nextInt();
            int j = scan.nextInt();

            Collections.swap(List,i-1,j-1);
        }


        for(int b=0; b<N; b++)
            System.out.println(List.get(b));
    }
}
