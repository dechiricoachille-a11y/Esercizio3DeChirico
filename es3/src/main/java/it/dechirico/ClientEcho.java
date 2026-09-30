package it.dechirico;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class ClientEcho {

    public static void main (String[] args){
    int porta = 5000;
    String host = "local_host";
    try(
        ServerSocket s1b = new ServerSocket(porta)){
        System.out.println("server trovato. Inserisci il messaggio");

        Scanner scan = new Scanner (System.in);
        String messaggioInviato = scan.nextLine();

        try(Socket sock = new Socket(host, porta);
            OutputStream newMessage = sock.getOutputStream() ){

                newMessage.write(messaggioInviato.getBytes());

                newMessage.flush();
            
        }catch (Exception e) {
            // TODO: handle exception
        }

    }
        catch (Exception e) {
        // TODO: handle exception
    }
    
}
}
