import java.io.*;
import java.net.*;

class ChatSever
{
    public static void main(String A[]) throws Exception
    {
       SeverSocket ssobj = new SeverSocket(5100);
       System.out.println("Sever is waiting at port 5100");

       Socket sobj = ssobj.accept();
       System.out.println("client request gets accepted sucessfully");

       PrintStream pobj = new PrintStream(sobj.getOutputStream());
       BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
       BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));






       String str = bobj1.readLine();
       System.out.println("Client says:"+str);
       System.out.println("Enter message for client :");
       str = bobj1.readLine();
       pobj.println(str);


    }
