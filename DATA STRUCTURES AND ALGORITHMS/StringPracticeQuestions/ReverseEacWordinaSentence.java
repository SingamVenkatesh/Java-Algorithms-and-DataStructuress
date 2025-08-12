package RecursionLearning.StringPracticeQuestions;

public class ReverseEacWordinaSentence {
    public static void main(String[] args) {
        //  input :Hello World Java
        //output :  olleH dlroW avaJ

        String str="Hello World Java";

        String[] arr=str.split(" ");
        StringBuffer sb=new StringBuffer();
        StringBuffer ans=new StringBuffer();


        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
            sb.reverse();
            ans.append(sb+ " ");
            sb.setLength(0);

        }
        System.out.println(ans.toString());
    }
}
