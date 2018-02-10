import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

    String[] adviceList = {"Hello","World","Socket Programming","HeadFirst Java"};
    public  void serverGo()
    {
        ServerSocket serverSock ;
        try {
            serverSock = new ServerSocket(5000);
            while(true)
            {
                Socket sock = serverSock.accept();

                PrintWriter printWriter = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                printWriter.println(advice);
                printWriter.close();

            }

        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private String getAdvice()
    {
        int random = (int) (Math.random()*adviceList.length);

            return adviceList[random];

    }

    public static void main(String[] args) {
        ServerSide serverSide = new ServerSide();
        serverSide.serverGo();
    }
}
