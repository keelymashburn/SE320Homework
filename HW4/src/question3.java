import java.text.NumberFormat;
import java.util.Locale;

public class question3 
{
	public static void main(String[] args)
	{
		// UK (a)
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.UK);
		numberFormat.setMaximumFractionDigits(2);
		System.out.println(numberFormat.format(12345.678));
		
		// US Currency (b)
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(currencyFormat.format(12345.678));
		
		// Parse into number (c)
		NumberFormat numberParse = NumberFormat.getInstance(Locale.US);
		try 
		{
			Number number = numberParse.parse("12,345.678");
			System.out.println(number.doubleValue());
		}
		catch (Exception E) 
		{
			E.printStackTrace();
		}
	}
}
