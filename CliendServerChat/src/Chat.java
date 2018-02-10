/*
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Chat {
    ArrayList clientOutputStreams;

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket s;

        public ClientHandler(Socket clientSocket) {
            try {
                s = clientSocket;
                InputStreamReader inputStreamReader = new InputStreamReader(s.getInputStream());
                reader = new BufferedReader(inputStreamReader);


            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

            public void run () {
                String message;
                try {
                    while ((message = reader.readLine()) != null) {
                        System.out.println("Read" + message);
                        tellEveryone(message);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
    }


    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.go();
    }

    public void go()
    {
        ServerSocket serverSocket;
        Socket clientSocket;

        try{
            serverSocket= new ServerSocket(5000);
            clientSocket = serverSocket.accept();
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
            printWriter.println("Hello World");
            clientOutputStreams.add(printWriter);

            Thread t = new Thread(new ClientHandler(clientSocket));
            t.start();

            System.out.println("Got a client connection");


        }catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void tellEveryone(String message)
    {
        Iterator it = clientOutputStreams.iterator();
        while(it.hasNext())
        {
            try{
                PrintWriter writer = (PrintWriter)it.next();
                writer.println(message);
                writer.flush();

            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
*/
