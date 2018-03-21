import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

 class DiagonalDiff {

	int n;
	int a1=n-1;
    /*
     * Complete the diagonalDifference function below.
     */
     int diagonalDifference(int a[][]) {
        /*
         * Write your code here.
         */
		 int sum1=0;
	 int sum2=0;
	 int result;
		 for(int i=0;i<a.length;i++)
		 {
			 sum1=sum1+a[i][i];
		 }
		  for(int i=n;i>a[a1].length;i--)
		 {
			 sum2=sum2+a[i][i];
		 }
		 result=sum1+sum2;
		 return result;
    }

    

    public static void main(String[] args)  {
         Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] a = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scan.nextInt();
			}
			}
        int result = diagonalDifference(a);

       System.out.println(result);
    }
}
