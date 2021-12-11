import java.net.ServerSocket;
import java.net.Socket;

public class Question2 
{
	public static void main(String[] args) 
	{
        try (ServerSocket serverSocket = new ServerSocket(6000)) 
        {
            System.out.println("Server Started!");
            Socket socket = serverSocket.accept();
            
            while(true) 
            {
                Server_Q2 server = new Server_Q2(socket);
                server.start();
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
	}
}