import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s=a.nextInt();
        int z=0,x=0,c=0;
        while (s!=-999){
            if(s>0){
                z++;
            }
            else if (s==0){
                x++;
            }
            else {
                c++;
            }
            s=a.nextInt();
        }
        System.out.println(z);
        System.out.println(x);
        System.out.println(c);
    }
}
