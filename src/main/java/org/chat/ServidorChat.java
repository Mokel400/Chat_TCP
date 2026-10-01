package org.chat;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorChat {

    public static void main(String[] args) {
        try {
            while(true){

                ServerSocket server = new ServerSocket(5000);

                System.out.println("Servidor Iniciado");
                System.out.println("Esperando cliente");


                Socket cliente = server.accept();

                System.out.println("Cliente conectado");

                PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

            }
        } catch(Exception e){

        }
    }
}
