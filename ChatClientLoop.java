import java.io.*;
import java.net.*;

class ChatClientLoop
{
    public static void main(String A[])throws Exception
    {



       Socket sobj = new Socket("localhost",5100);
       System.out.println("Client gets connected with server suceessfuuly");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
       BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
       BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("________________________________");
     System.out.println("__________Marvellous Client______");
     System.out.println("________________________________");

     String str1 = null , str2 = null;
     System.out.println("enter message for sever");
     while(!(str1= bobj2.readLine()).equals("End"))
     {
        pobj.println(str1);
        str2 =  bobj1.readLine();
        System.out.println("sever says"+str2);
        System.out.println("enter message for sever");
    
     }


      
    }
}