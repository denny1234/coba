import java.util.Scanner;

class PangkatDouble
{	double cetakA(int angka)
	{	int kuadrat = (int)Math.pow(angka,2);
		return kuadrat;
	}
	
	double cetakB(int angka)
	{	int pangkatTiga = (int)Math.pow(angka,3);
		return pangkatTiga;
	}
	
	public static void main (String[] args)
	{	PangkatC rapi = new PangkatC();
		Scanner masuk = new Scanner(System.in);
		System.out.println("Berapa angka maksimal???...");
		int angkaMax = masuk.nextInt();
		
		System.out.println("Angka\t\tKuadrat\t\tPangkat Tiga");
		for (int angka = 1; angka <= angkaMax; angka++)
		{	int kuadrat = (int)rapi.cetakA(angka);
			int pangkatTiga = (int)rapi.cetakB(angka);
			System.out.print(angka + "\t\t");
			System.out.print(kuadrat + "\t\t");
			System.out.println(pangkatTiga + "\t\t");
		}
	}
}