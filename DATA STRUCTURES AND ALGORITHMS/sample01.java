package RecursionLearning;

import java.util.HashMap;
import java.util.Map;

public class sample01 {
    public static void main(String[] args)
    {
        String str="magniS hsetakneV";
        String ans="";



        for(int i=str.length()-1;i>=0;i--)
        {

            ans=ans+str.charAt(i);

        }
        System.out.println(ans);

        HashMap<Integer,String> mapp=new HashMap<>();
        mapp.put(1,"venky");
        mapp.put(2,"singam");
        mapp.put(3,"patel");


        for (Integer key : mapp.keySet()) {
            System.out.println("Key: " + key + ", Value: " + mapp.get(key));
        }

        for(Integer i:mapp.keySet())
        {
            System.out.println("key iss  " + i + "  values is  "+ mapp.get(i));
        }


        // print(1);

    }

    static void print(int n)
    {

        if(n==5)
        {
            System.out.println(5);
           return;
        }
        System.out.println(n);

        print(n+1);


    }
}
