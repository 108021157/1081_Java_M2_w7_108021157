import java.util.Scanner;

public class M2Q23 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        long s=a.nextLong();
        while (s>0){
            System.out.print(s%10);
            s/=10;
        }
        System.out.println();
    }
}
