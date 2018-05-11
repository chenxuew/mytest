package test01;

import java.io.IOException;
import java.net.ServerSocket;

public class hn {

	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8080);
		System.out.println("’º”√8080");
		socket.accept();
		socket.close();
	}
}
