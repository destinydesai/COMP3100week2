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
        String str = in.readLine(); //server replies with OK
        dout.write(("AUTH 46399178\n").getBytes());
        dout.flush();
        String str = in.readLine(); //server replies with OK, prints out welcome message

        //identifies largest server
        for (int i = 0; i < s.size(); i++) {
            //if (this.core == server.core) 
        }

        //sends REDY until receiving NONE message from server

        //if server message contains JOBN, ss.split and schedule job, and then send REDY message again (for loop)

            /*
            while (!str.equals("QUIT")) {
            String str = in.readLine();
            dout.write(("REDY\n").getBytes());
            dout.flush();
            String str = in.readLine();
            dout.write(("GETS Capable\n").getBytes());
            dout.flush();
            String str = in.readLine();
            */
        
        
        /*
        
        Connect ds-server
        //Identify the largest server type
        Send a GETS message, e.g., GETS All
        Receive DATA nRecs recSize // e.g., DATA 5 124
        Send OK
        For i = 0; i < nRecs; ++i do
        Receive each record
        Keep track of the largest server type and the number of servers of that type
        End For
        Send OK
        Receive .
        While the last message from ds-server is not NONE do // jobs 1 - n
        Send REDY
        Receive a message // typically one of the following: JOBN, JCPL and NONE
        If JOBN then
        Schedule a job // SCHD
        End If
        End While
        Send QUIT
        Receive QUIT
        
        while (!str.equals("QUIT")) {
            System.out.println("Server says: " + str);

        }

        prints out JOBN - needs last three numbers
        GETS Capable (x xxx xxxx) - prints out DATA message
        OK - prints out servers (names and numbers)
        OK - period (connection)
        SCHD jobID serverName serverNumber
        REDY ...

        ss.split()
        List.add(new Server)
        compareTo implementation
            this.core == server.core
        
        reset index once servers are done

        javac -source 1.8 -target 1.8 *.jobs

        introduction of report - this report presents implement largest algorithm 
        system overview - how ds-dim works, protocol how ds-client can connect
        design - high-level design (classes, each class holds jobs, purpose of each class)
        implementation - what are the thigns you have used ti implemnt LRR algorithm, what function does what
        presentation - using LaTeX

        */

        dout.close();
        s.close();
    }
