import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiagonalDiff {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */
		 int sum1=0,sum2=0;
	 int a1=a.length;
	 int result,i=0,j=(a1-1);
	 for( int pi=0;pi<a1;pi++)
	 {
		 sum1+=a[pi][pi];
	 }
	 //System.out.println(sum1);
	 
	while(i<a1)
	{
		while(j>=0)
		{
			sum2+=a[i][j];
			break;
			
		}
		j--;
		i++;
		}
	//System.out.println(sum2);
	 result=Math.abs(sum1-sum2);
	 return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        System.out.println(result);
    }
}
