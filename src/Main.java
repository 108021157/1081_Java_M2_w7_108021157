import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int s=a.nextInt();
        int sum=0;
        for (int z=2;z<=s;z++){
            int x=z;
            while (x%2==0){
                x/=2;
            }
            while (x%3==0){
                x/=3;
            }
            while (x%5==0){
                x/=5;
            }
            if (x==1){
                sum+=z;
            }
            System.out.println(sum);
        }
    }
}
