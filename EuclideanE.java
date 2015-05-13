import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class EuclideanE
{	static double Euclid(double x1, double x2, double y1, double y2)
	{	double hasil = Math.sqrt(Math.pow((y2-x2),2)+Math.pow((y1-x1),2));
		return hasil;
	}
	
	public static void main(String[] args)
		{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Masukkan koordinat titik A dan B dan tekan enter :");
			try
			{	String inputX1 = br.readLine();
				double x1 = Double.parseDouble(inputX1);
				String inputX2 = br.readLine();
				double x2 = Double.parseDouble(inputX2);
				String inputY1 = br.readLine();
				double y1 = Double.parseDouble(inputY1);
				String inputY2 = br.readLine();
				double y2 = Double.parseDouble(inputY2);
				double z = Euclid(x1,x2,y1,y2);
				System.out.println("Jarak antara titik A("+x1+","+x2+")"+" dan titik B("+y1+","+y2+")"+" adalah : "+z);
			}	catch (IOException iox)
				{	iox.printStackTrace();
				
				}	catch (NumberFormatException nfex)
					{	System.out.println("Masukan yang anda berikan bukan dalam format angka...");
					}
		
		}
}
