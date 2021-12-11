import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Server_Q1 
{
	private Socket currSocket;
	
    public Server_Q1(Socket socket) 
    {
        this.currSocket = socket;
    }

    public void getBMI() 
    {
    	double BMI = 0;
        try 
        {
            DataInputStream in = new DataInputStream(currSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(currSocket.getOutputStream());
            
            while(BMI != 0) 
            {
                double weight = in.readDouble();
                double height = in.readDouble();
                
                System.out.println("Info Received: " + weight + "kg, " + height + "meters");
                BMI = weight / (height * height);
               
                out.writeDouble(BMI);
                out.flush();
            }
            
            in.close();
            out.close();
            currSocket.close();
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}