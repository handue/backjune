import java.util.Scanner;
public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int a = Math.min(x, w-x);
        int b = Math.min(y, h-y);
        int distance = Math.min(a,b);

        System.out.println(distance);

    }
}
