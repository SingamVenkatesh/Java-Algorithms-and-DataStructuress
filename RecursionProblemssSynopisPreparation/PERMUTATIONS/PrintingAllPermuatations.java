package RecursionProblemssSynopisPreparation.PERMUTATIONS;

import java.util.ArrayList;
import java.util.List;

public class PrintingAllPermuatations
{
    public static void main(String[] args) {

            List<String> list=new ArrayList<>();

        Permuta("","abc",list);
        System.out.println(list);
      //  System.out.println(list);



        // function to return arraylist and all permutaions in that

       ArrayList<String> ans= PermutationInList("","abc");
        System.out.println(ans);

    }

    private static void Permuta(String p, String up,List<String> list)
    {
        if (up.isEmpty()) {
            System.out.println(p);
            list.add(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            Permuta(f + ch + s, up.substring(1),list);

        }

    }








    // to add all permutations in arraylist

    private static ArrayList<String> PermutationInList(String p, String up)
    {
        if (up.isEmpty()) {
           ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
ArrayList<String> ans=new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
         ans.addAll(PermutationInList(f + ch + s, up.substring(1)));

        }

        return ans;

    }



}

