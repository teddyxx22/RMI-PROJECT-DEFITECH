package com.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerMain {
    public static void main(String[] args) {
        try {
            // Crée et lance le registre RMI sur le port 1099
            LocateRegistry.createRegistry(1099);

            // Crée l’objet serveur
            ChatServer server = new ChatServer();

            // Lie le serveur au registre avec le nom attendu par le client
            Naming.rebind("RMIchatServer", server);

            System.out.println("Serveur RMI prêt et en attente de clients...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
