import java.util.Scanner;

public class M2Q26 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        int d = s;
        while (s >= 3) {
            d += s / 3;
            s = s / 3 + s % 3;
        }
        System.out.println(d);
    }
}
