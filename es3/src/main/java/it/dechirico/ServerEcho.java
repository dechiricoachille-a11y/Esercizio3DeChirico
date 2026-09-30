package it.dechirico;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class ServerEcho{
    public static void main (String[] args){
    int porta = 5000;
    try(ServerSocket s1 = new ServerSocket(porta)){
        System.out.println("Il serer è in ascolto sulla porta " + porta);

        Socket c1 = s1.accept();
        
    

    } catch (Exception e){

    }
}
}

