package RecursionLearning;

import java.math.BigInteger;

public class StringBuffer {
    public static void main(String[] args) {
       // char a='A';
       // System.out.println((int) a);
      // char c='9';
       // System.out.println(c-'0');
        int num = 'c'- '0';  // Converts character 'c' to its integer equivalent
        System.out.println(num);

       // int a=1234567891;
        BigInteger A= BigInteger.valueOf(123457654);
        BigInteger B=BigInteger.valueOf(6543);

        BigInteger X=new BigInteger("1234567812345678");
        BigInteger Y=new BigInteger("9876543217654354");
        BigInteger Z=X.add(Y);
        System.out.println(Z);


        BigInteger ans=A.add(B);
        System.out.println(ans);

        System.out.println();



    }


}
