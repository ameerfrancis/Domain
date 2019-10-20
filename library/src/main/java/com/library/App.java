package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

@SpringBootApplication
public class App {

    //server socket
    private ServerSocket servSock;
    //reg socket to listen
    private Socket client;

    private String x;

    public void Run() {
        try {
            //port number, max no. of clients
            System.out.println(" Hi Im in method Run");
            servSock = new ServerSocket(5678, 10);

            client = servSock.accept();
            System.out.println("servsock accepted");

            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());

            x = (String)in.readUTF();
            System.out.println(x);



        }catch(Exception ioe){
            System.out.println("Exception " + ioe.getMessage());
        }
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

        App s = new App();
        s.Run();
    }
}
