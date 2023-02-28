    import java.util.Scanner;
    public class Main{
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);

            int length=1;


                int i=0;
                String a = scan.nextLine();
                String b = scan.nextLine();
                String c = scan.nextLine();
                String d = scan.nextLine();
                String e = scan.nextLine();
                String f = scan.nextLine();
                String g = scan.nextLine();
                String h = scan.nextLine();

                for(int r=0;r<8;r+=2){
                    if(a.indexOf("F",r)==r){
                        i++;
                    }
                }
                for(int r=1;r<8;r+=2){
                    if(b.indexOf("F",r)==r){
                        i++;
                    }
                }
                for(int r=0;r<8;r+=2){
                    if(c.indexOf("F",r)==r){
                        i++;
                    }
                }
                for(int r=1;r<8;r+=2){
                    if(d.indexOf("F",r)==r){
                        i++;
                    }
                }

                for(int r=0;r<8;r+=2){
                    if(e.indexOf("F",r)==r){
                        i++;
                    }
                }

                for(int r=1;r<8;r+=2){
                    if(f.indexOf("F",r)==r){
                        i++;
                    }
                }

                for(int r=0;r<8;r+=2){
                    if(g.indexOf("F",r)==r){
                        i++;
                    }
                }

                for(int r=1;r<8;r+=2){
                    if(h.indexOf("F",r)==r){
                        i++;
                    }
                }

                System.out.println(i);

        }
    }
