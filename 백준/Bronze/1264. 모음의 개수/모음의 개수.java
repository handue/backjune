import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            int b=0;
            String a = scan.nextLine();
            if(a.charAt(0)==35){
                break;
            }
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i)==97||a.charAt(i)==101||a.charAt(i)==105||a.charAt(i)==111||a.charAt(i)==117||
                        a.charAt(i)==65||a.charAt(i)==69||a.charAt(i)==73||a.charAt(i)==79||a.charAt(i)==85){
                    b++;
                }

            }
            System.out.println(b);
        }
    }
}
