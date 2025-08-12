package RecursionLearning.MaZEProblems;
// https://leetcode.com/problems/unique-paths/

import java.util.Arrays;

class UniquePathUisngDp {

    public static void main(String[] args)
    {
        int m=3;int n=7;
       int ans= uniquePaths(m,n);
        System.out.println(ans);
    }
        public static int uniquePaths(int m, int n)
        {
            int[][] arr=new int[m+1][n+1];
            for(int[] a:arr)
            {
                Arrays.fill(a,-1);
            }
            return ansPath(m,n,arr);
        }
        public static int ansPath(int m,int n,int[][] arr)
        {
            if(n==1||m==1)
            {
                return 1;
            }
            if(arr[m][n]!=-1)
            {
                return arr[m][n];

            }
            return arr[m][n]=ansPath(m-1,n,arr) + ansPath(m,n-1,arr);
        }
    }





