import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        for (int s=1;s<=n;s++){
            for (int d=1;d<=s;d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
