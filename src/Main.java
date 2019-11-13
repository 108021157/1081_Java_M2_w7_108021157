import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int s=a.nextInt();
        int z=1,x=1;
        while (z<=s){
            System.out.print(z+"\t");
            z=z+x;
            x++;
        }
        System.out.println(z);
        z=1;
        while (z<=s+1){
            for(int c=1;c<=z;c++){
                System.out.print(z+"\t");
            }
            z++;
        }
    }
}
