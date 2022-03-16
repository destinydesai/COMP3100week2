import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 50000);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
       
        //String str, str2, str3;
        dout.write(("HELO\n").getBytes());
        dout.flush();
        String str = in.readLine();
        System.out.println("Server says: " + str);
        dout.write(("AUTH 46399178\n").getBytes());
        dout.flush();
        String str2 = in.readLine();
        System.out.println("Server says: " + str2);
        dout.write(("REDY\n").getBytes());
        dout.flush();
        String str3 = in.readLine();
        System.out.println("No jobs to schedule.");

        dout.close();
        s.close();
    }
}
