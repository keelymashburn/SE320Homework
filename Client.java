import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.lang.Math;   

public class Client 
{
	public static void main(String[] args) 
	{
        double BMI = 0;
        double weight = Math.random();
        double height = Math.random();  // (max - min + 1) + min

        try 
        {
            Socket socket = new Socket("127.0.0.1", 6000);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out= new DataOutputStream(socket.getOutputStream());
            
            while(BMI != 0)
            {
                out.writeDouble(weight);
                out.writeDouble(height);
                out.flush();
                BMI = in.readDouble();
                System.out.println("BMI is: " + BMI);
            }
            out.close();
            socket.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
