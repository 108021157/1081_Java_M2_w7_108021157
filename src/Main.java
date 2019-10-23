import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int s=a.nextInt();
        int sum=0;
        for (int d=3;d<=s;d+=3){
            sum=sum+d;
        }
        System.out.println(sum);
    }
}