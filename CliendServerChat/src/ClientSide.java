import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSide {
    public void go()

    {
        try{
            Socket s = new Socket("127.0.0.1",5000);
            InputStreamReader reader = new InputStreamReader(s.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(reader);
            String advice = bufferedReader.readLine();
            System.out.println(advice);
            reader.close();

        }catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClientSide client = new ClientSide();
        client.go();
    }
}
