package RecursionLearning;
import java.util.Arrays;
public class AccoliteProblem {
    public static void main(String[] args) {
        String str="Singam Venkatesh Patel";// magniS hsetakneV letaP
        StringBuilder sb=new StringBuilder();
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
            System.out.print(sb.reverse() + " ");
            sb.setLength(0);
        }
    }
}
