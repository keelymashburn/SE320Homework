import java.net.ServerSocket;
import java.net.Socket;

public class Question1 
{
	public static void main(String[] args) 
	{
        try (ServerSocket serverSocket = new ServerSocket(6000)) 
        {
            System.out.println("Server Started!");
            Socket socket = serverSocket.accept();
            
            while(true) 
            {
                Server_Q1 server = new Server_Q1(socket);
                server.getBMI();
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
	}
}