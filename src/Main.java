import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s=a.nextInt();
        int sum=0,d=0;
        String str="";
        for (int z=1;z<s;z++){
            d=z;
            str="";
            sum=0;
            while (sum<s && d<s){
                sum+=d;
                if(sum==s){
                    str=str+"+"+Integer.toString(d);
                    System.out.println(str);
                }
                else {
                    if(z==d){
                        str=Integer.toString(d);
                    }
                    else {
                        str=str+"+"+Integer.toString(d);
                    }
                    d++;
                }
            }
        }
    }
}
