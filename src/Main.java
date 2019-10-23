import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        float z=a.nextFloat();
        float max=z;
        float min=z;
        for (int s=1;s<10;s++){
            z=a.nextFloat();
            if (max<z){
                max=z;
            }
            else if (min>z){
                min=z;
            }
        }
        System.out.printf("max=%.2f\n",max);
        System.out.printf("min=%.2f\n",min);
    }
}