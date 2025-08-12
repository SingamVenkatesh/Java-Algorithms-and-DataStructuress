package RecursionLearning.StringQuestions;

import java.util.ArrayList;

public class SUbseTaddiNginArrayList {
    public static void main(String[] args) {
             ArrayList<String> ans=SubseArrList("","abc",new ArrayList<String>());
        System.out.println(ans);
    }
    //static ArrayList<String> list=new ArrayList<>();
    public static ArrayList<String> SubseArrList(String p,String up,ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
         SubseArrList(p+ch,up.substring(1),list);
         SubseArrList(p,up.substring(1),list);
        return list;
    }
}
