package it.dechirico;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ServerEcho{
    public static void main (String[] args){
    int porta = 5000;
    try(ServerSocket s1 = new ServerSocket(porta)){
        System.out.println("Il serer è in ascolto sulla porta " + porta);

        try(Socket c1 = s1.accept();
        InputStream message = c1.getInputStream();
        OutputStream newMessage = c1.getOutputStream();){
        byte[] buffer = new byte[1024];

                // byteLetti conterrà il numero di byte ricevuti 
                int byteLetti = message.read(buffer);

                if (byteLetti != -1) {
                    // 3. Convertiamo i byte ricevuti in una Stringa
                    String messaggio = new String(buffer, 0, byteLetti);
                    
                    // 4. Modifichiamo il testo in maiuscolo
                    messaggio = messaggio.toUpperCase();
                    
                    // 5. Convertiamo la stringa modificatam in byte
                    newMessage.write(messaggio.getBytes());

                    newMessage.flush();
                }
        




        } catch (Exception e) {

        }
        
        }catch (Exception e) {

        }
    



    }
}


