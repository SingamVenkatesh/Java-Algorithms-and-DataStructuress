package CognizantQuestIOns;

import java.util.Arrays;

public class BUBBLESORTT {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=5;
        arr[1]=4;
        arr[2]=3;
        arr[3]=2;
        arr[4]=1;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true)
            {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
