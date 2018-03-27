//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Dictionary{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> PhoneBook=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            PhoneBook.put(name,phone);
            
        }
		
        /*while(in.hasNext()){
            String s = in.next();
            // Write code here
			System.out.println(PhoneBook.toString());
        }*/
        in.close();
    }
}
