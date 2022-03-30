
import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        //DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        //String str, str2, str3;
        String str = in.readLine(); //client says HELO
        System.out.println("Client says: " + str);
        dout.write(("OK\n").getBytes());
        dout.flush();
        String str2 = in.readLine(); //client provides AUTH message
        System.out.println("Client says: " + str2);
        System.out.println("Welcome!");
        dout.write(("OK\n").getBytes());
        String str3 = in.readLine();
        System.out.println("Client says: " + str3);

        //for loop with jobs (JOBN statements)
        //dout.write 
        //dout.flush

        dout.write(("NONE\n").getBytes());
        dout.flush();

        //dis.close();
        //dout.close();
        s.close();
        ss.close();
    }
}
