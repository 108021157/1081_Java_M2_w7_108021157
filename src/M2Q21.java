import java.util.Scanner;
import java.math.BigInteger;

public class M2Q21 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        int z = 0;
        BigInteger res =new BigInteger("1");
        for (int d = s; d > 1; d--) {
            res = res.multiply(new BigInteger(Integer.toString(d)));
        }
        while (res.mod(new BigInteger("10")).intValue()==0) {
            z++;
            res=res.divide(new BigInteger("10"));
        }
        System.out.println(z);
    }
}