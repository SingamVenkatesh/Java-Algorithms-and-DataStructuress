
public class MaxelementIndex {
    public static void main(String[] args)
    {
        int[] arr={5,4,7,6,2,4,8,9,1,44,8,5,2,8};
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[index])
            {
                index=i;

            }
        }
        System.out.println(index);


    }
}
