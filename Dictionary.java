//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Dictionary{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
		String a[]=new String[100000];
        int n = in.nextInt();
		int i=0,j=0,c=0;
		long  m=100000;
        Map<String,Integer> PhoneBook=new HashMap<String,Integer>();
        for( i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            PhoneBook.put(name,phone);
            
        }
		
        while(!in.hasNextInt()){
            String s = in.next();
			while(i<m)
			{
				//System.out.println("a");
				a[i-1]=s;
				c+=1;
				break;
				
			}
			i+=1;
            // Write code here
			
        }
		
for(String key:PhoneBook.keySet())
{
	for(j=0;j<c;j++)
	{
		if(a[j]==key)
		{
System.out.println("abc");
		}
		}
		}
		
        in.close();
    }
}
