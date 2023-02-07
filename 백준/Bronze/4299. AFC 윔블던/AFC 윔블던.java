import java.util.Scanner;
public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); // 합
        int b = scan.nextInt(); // 차
        int c= a+b;
        int d= a-b;


        if((c)%2!=0||a<b){
            System.out.println(-1);
        }
        else{
            System.out.printf("%d %d",(c)/2,(d)/2);
        }

    }

}


