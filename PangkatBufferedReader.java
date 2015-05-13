import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class PangkatBufferedReader
{	static double cetakA(int angka)
	{	int square = (int)Math.pow(angka,2);
		return square;
	}
	
	static double cetakB(int angka)
	{	int cube = (int)Math.pow(angka,3);
		return cube;
	}
	
	public static void main (String[] args)
	{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Berapa angka maksimal????.....");
			try
			{	String inputangkaMax = br.readLine();
				int angkaMax = (int)Double.parseDouble(inputangkaMax);
				
				System.out.println("Angka\t\tKuadrat\t\tPangkat Tiga");
					for (int angka = 1; angka <= angkaMax; angka++)
					{	int kuadrat = (int)cetakA(angka);
					int pangkatTiga = (int)cetakB(angka);
					System.out.print(angka + "\t\t");
					System.out.print(kuadrat + "\t\t");
					System.out.println(pangkatTiga + "\t\t");
					}
			}	catch (IOException iox)
				{	iox.printStackTrace();
				
				}	catch (NumberFormatException nfex)
					{	System.out.println("Masukan yang anda berikan bukan dalam format angka...");
					}
		
	}
}