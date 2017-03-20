package ch.heigvd.res.stpatrick;
import java.io.*;
import java.net.*;
/**
 * class to communicate with the leprechaun
 */
public class LeprechaunTCP
{
    private static final int port = 1703; // given port number
    private static final String ip = "10.192.114.100";


    public static void main(String argv[]) throws Exception
    {
        // https://systembash.com/a-simple-java-tcp-server-and-tcp-client/
        String sentence;
        String modifiedSentence;
        BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
        Socket clientSocket = new Socket(ip, port);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        sentence = inFromUser.readLine();
        outToServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);
        clientSocket.close();

    }
}