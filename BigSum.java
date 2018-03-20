import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BigSum{

    /*
     * Complete the aVeryBigSum function below.
     */
    static long aVeryBigSum(int n, long[] ar) {
        /*
         * Write your code here.
         */
		 long result=0;
	 for(int i=0;i<n;i++)
	 {
		 result=result+ar[i];
	 }
	 return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        int n = Integer.parseInt(scan.nextLine().trim());

        long[] ar = new long[n];

        

        for (int arItr = 0; arItr < n; arItr++) {
            ar[arItr]=scan.nextInt();
        }

        long result = aVeryBigSum(n, ar);

        

       System.out.println(result);
    }
}
