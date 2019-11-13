import java.util.Scanner;

public class M2Q22 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        for (int z = 1; z < s; z++) {
            for (int x = z + 1; x < s; x++) {
                for (int c = x + 1; c < s; c++) {
                    if ((z + x + c) <= s) {
                        if ((z * z + x * x) == c * c) {
                            System.out.println(z + "\t" + x + "\t" + c);
                        }
                    }
                }
            }
        }
    }
}
