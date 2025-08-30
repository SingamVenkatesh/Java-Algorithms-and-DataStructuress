package IntegerTOBinary;

public class MagicNumberOf5 {
    public static void main(String args[])
    {
        int number=6;
        // that means binary of 6 is 110 => so here==> 125 * 1+ 12 * 1+ 0*5
                           //               125  25 5
                                                        //100 + 5 *0 + 1* 0=150 answer
       int base=5;
        int ans=0;
        while (number>0)
        {
            int last=number & 1; // taking last binary digit     here number & 1 --> means retriving last binary digit
            number=number >> 1;  // right shieft means removing right digit i mean binary digit
            ans +=last * base;
            base=base*5;

        }
        System.out.println(ans);


    }

}
