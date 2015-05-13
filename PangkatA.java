class PangkatA
{	public static void main(String[] args)
		{	int angkaMax = 10;	
			System.out.println("angka\t\tkuadrat\t\tpangkat Tiga");
			for (int angka = 0; angka < angkaMax; angka++)
			{	double kuadrat = Math.pow(angka,2);
				double pangkatTiga = Math.pow(angka,3);
				System.out.print(angka + "\t\t");
				System.out.print(kuadrat + "\t\t");
				System.out.println(pangkatTiga + "\t\t");
			}
		}
}