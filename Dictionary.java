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
            PhoneBook.put(name,phone);
            
        }
        //System.out.println(i);
		
        while(!in.hasNextInt()){
            String s = in.next();
			while(j<m)
			{
				//System.out.println("a");
				a[j]=s;
				c+=1;
				break;		
			}
			j+=1;
        }
     
 
for(String key: PhoneBook.keySet())
{
	for(int p=0;p<c;p++)
	{
		if(a[p].equals(key))
		{
			System.out.println(key+ "=" +PhoneBook.get(key));
		}
		else
			System.out.println("not found");
		
		}
	//System.out.println(key);
}
        in.close();
    }
}
