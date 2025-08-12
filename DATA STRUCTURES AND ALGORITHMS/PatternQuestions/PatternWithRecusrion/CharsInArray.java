package RecursionLearning.PatternQuestions.PatternWithRecusrion;

public class CharsInArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};


        for(int i=0;i<arr.length;i++)
        {
            if(i<arr.length-1)
            {
                System.out.println(arr[i]+arr[i+1] + " ");

            }
        }
    }
}
