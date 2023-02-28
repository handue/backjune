import java.util.Scanner;
public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int a = 1;
        int ball = 1;


        while(a<=M){
            int x = scan.nextInt();
            int y = scan.nextInt();

            if(ball==x){

                ball=y;
            }

            else if(ball==y){
                ball=x;
            }

            else if(ball==x||ball==y){
                ball=x;
            }


            a++;
        }

        System.out.println(ball);

        if(ball!=1&&ball!=2&&ball!=3){
            System.out.println(-1);
        }
    }
}
