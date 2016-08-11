package cooksys.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args)
	{
		serverSide();
	}

	static void serverSide()
	{
		try(
			ServerSocket ss = new ServerSocket(12345);	
			
			Socket s = ss.accept();
			
			InputStream in = s.getInputStream();
			Reader base = new InputStreamReader(in);
			BufferedReader rin = new BufferedReader(base);				
			)
		{
			System.out.println(rin.readLine());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
