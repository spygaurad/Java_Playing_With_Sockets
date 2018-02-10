//Version 1: Can only send from client side



//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
//import java.io.*;
//import java.net.Socket;
//import java.awt.event.ActionEvent;
//
//public class OnlyClientSend {
//    JTextField outgoing;
//    Socket sock;
//    ObjectOutputStream objectOutputStream;
//
//    public void go() {
//        JFrame frame = new JFrame("Ludierously Simple Chat client");
//        JPanel mainPanel = new JPanel();
//        outgoing = new JTextField(20);
//        JButton sendButton = new JButton("send");
//        sendButton.addActionListener(new SendButtonListener());
//        mainPanel.add(outgoing);
//        mainPanel.add(sendButton);
//        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
//        setUpNetworking();
//        frame.setSize(400, 500);
//        frame.setVisible(true);
//    }
//
//    private void setUpNetworking() {
//        try {
//            sock = new Socket("127.0.0.1", 5000);
//            objectOutputStream = new ObjectOutputStream(sock.getOutputStream());
//            System.out.println("Connection Established");
//
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//
//    public class SendButtonListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent ev) {
//            try {
//                objectOutputStream.writeChars(outgoing.getText());
//                objectOutputStream.flush();
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//            outgoing.setText("");
//            outgoing.requestFocus();
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        new OnlyClientSend().go();
//    }
//}
//
//
//
//
//
