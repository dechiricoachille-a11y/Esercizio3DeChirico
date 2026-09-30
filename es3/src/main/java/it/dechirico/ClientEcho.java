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
    try(ServerSocket s1b = new ServerSocket(porta)){
        System.out.println("server trovato. Inserisci il messaggio");

        Scanner scan = new Scanner (System.in);
        String messaggioInviato = scan.nextLine();

    }
        catch (Exception e) {
        // TODO: handle exception
    }
    
}
}
