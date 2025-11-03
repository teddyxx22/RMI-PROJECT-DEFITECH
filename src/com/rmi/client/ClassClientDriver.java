package com.rmi.client;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import com.rmi.server.ChatServerIF;
public class ClassClientDriver {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		String chatServerURL = "rmi://localhost/RMIchatServer";
		ChatServerIF chatServer = (ChatServerIF) Naming.lookup(chatServerURL);
		new Thread(new ChatClient(args[0], chatServer)).start();
	}
}
