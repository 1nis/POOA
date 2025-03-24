package client;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clieentSock = new Socket("localhost", 4848);
            OutputStream os = clieentSock.getOutputStream();
            InputStream is = clieentSock.getInputStream();
            clieentSock.close();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
