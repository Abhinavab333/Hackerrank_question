import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


public class test {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
    Arrays.sort(ar);
	/*for(int i=0;i<n;i++)
	{
		System.out.println(ar[i]);
	}*/
        int a=ar[n-1];
		//System.out.println(a);
        int result=1;
        for(int i=(n-2);i>0;i--)
        {
            if(a==ar[i])
            {
                result+=1;
            }
        }
		
       return result;
		
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
