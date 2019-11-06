import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s=a.nextInt();
        int z,x;
        z=s;
        x=s-1;
        for(int d=1;d<x;x--){
            z*=x;
        }
        System.out.println(z);
    }
}
