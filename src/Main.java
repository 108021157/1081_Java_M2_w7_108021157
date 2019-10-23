import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        int d = s / 2;
        boolean flag = true;
        for (int x = 2; x <= d; x++) {
            if (s % x == 0) {
                flag = false;
            }
                if (flag) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }

