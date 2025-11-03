package com.rmi.server;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
public class ClassServerDriver {
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		Naming.rebind("RMIChatServer", new ChatServer());
	}
}
