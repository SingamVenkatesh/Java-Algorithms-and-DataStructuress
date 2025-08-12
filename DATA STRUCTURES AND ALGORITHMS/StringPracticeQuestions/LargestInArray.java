package RecursionLearning.StringPracticeQuestions;

public class LargestInArray {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,56,8,9,12,45,67};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
       System.out.println(max);
        int ans=0;
        int j=0;
        while(j<arr.length)
        {
            if(arr[j]>ans)
            {
                ans=arr[j];
            }
            j++;
        }
        System.out.println(ans);
    }
}
