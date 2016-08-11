package cooksys.client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class Client
{
	public static void main(String[] args)
	{
		clientSide();
	}

	static void clientSide()
	{
		try (Socket s = new Socket("10.1.1.143", 12345);
				OutputStream out = s.getOutputStream();
				Writer base = new OutputStreamWriter(out);
				Writer wout = new BufferedWriter(base);)
		{
			wout.write(Double.toString(Math.random()));
			wout.flush();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
