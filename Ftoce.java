import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ftoce
{	static double convert_Ftoc(double fahrenheit)
	{	double celcius = (5*(fahrenheit-32))/9;
		return celcius;
	}
	
	public static void main(String[] args)
		{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Masukkan nilai fahrenheit dan tekan enter ");
			try
			{	String inputFahrenheit = br.readLine();
				double f = Double.parseDouble(inputFahrenheit);
				double c = convert_Ftoc(f);
				System.out.println(f+" derajat Fahrenheit sama dengan "+c+" derajat celcius");
			}	catch (IOException iox)
				{	iox.printStackTrace();
				
				}	catch (NumberFormatException nfex)
					{	System.out.println("Masukan yang anda berikan bukan dalam format angka...");
					}
				
			
		}
}