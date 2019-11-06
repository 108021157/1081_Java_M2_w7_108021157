import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        long s=a.nextLong();
        int sum=0;int d=0;
        while (s>0){
            d++;
            sum+=s%10;
            s=s/10;
        }
        System.out.println(d);
        System.out.println(sum);
    }
}
