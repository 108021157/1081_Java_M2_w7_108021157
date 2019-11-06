import java.util.Scanner;

public class Ｍ２Ｑ９ {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        int d = a.nextInt();
        int z = Math.max(s, d);
        int x = Math.min(s, d);
        while (true) {
            if (z % x == 0) {
                break;
            }
            int tmp = z % x;
            z = x;
            x = tmp;
        }
        System.out.println(x);
    }
}