class PangkatB
{	static void cetak(int angkaMax)
	{	System.out.println("Angka\t\tKuadrat\t\tPangkat Tiga");
		for (int angka = 0; angka <= angkaMax; angka++)
		{	int kuadrat = (int)Math.pow(angka,2);
			int pangkatTiga = (int)Math.pow(angka,3);
			System.out.print(angka + "\t\t");
			System.out.print(kuadrat + "\t\t");
			System.out.println(pangkatTiga + "\t\t");
		}
	}
		public static void main(String[] args)
		{	cetak(9);
		}
}