import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int s=a.nextInt();
        int z=1,x=1;
        while (z<s){
            System.out.print(z+"\t");
            z=z+x;
            x++;
        }
        System.out.println(z);
    }
}
