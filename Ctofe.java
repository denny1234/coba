import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Ctofe
{	static double convert_Ctof(double celcius)
	{	double fahrenheit = ((9/5)*celcius)+32;
		return fahrenheit;
	}
	
	public static void main(String[] args)
		{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Masukkan nilai Celcius dan tekan enter :");
			try
			{	String inputCelcius = br.readLine();
				double c = Double.parseDouble(inputCelcius);
				double f = convert_Ctof(c);
				System.out.println(c+" derajat celcius, sama dengan "+f+" derajat fahrenheit");
			}	catch (IOException iox)
				{	iox.printStackTrace();
				
				}	catch (NumberFormatException nfex)
					{	System.out.println("Masukan yang anda berikan bukan dalam format angka...");
					}
		
		}
}
