class PangkatInputString
{	static double cetakA(int angka)
	{	int square = (int)Math.pow(angka,2);
		return square;
	}
	
	static double cetakB(int angka)
	{	int cube = (int)Math.pow(angka,3);
		return cube;
	}
	
	public static void main (String[] args)
	{	int angkaMax = (int)Double.parseDouble(args[0]);
		System.out.println("Angka\t\tKuadrat\t\tPangkat Tiga");
		for (int angka = 1; angka <= angkaMax; angka++)
		{	int kuadrat = (int)cetakA(angka);
			int pangkatTiga = (int)cetakB(angka);
			System.out.print(angka + "\t\t");
			System.out.print(kuadrat + "\t\t");
			System.out.println(pangkatTiga + "\t\t");
		}
	}
}