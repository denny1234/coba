import java.util.Scanner;

class Calculator
{	public static void main (String[] args)
	{	System.out.println("PILIHAN KALKULATOR");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("Masukkan pilihan: ");
		Scanner masuk = new Scanner(System.in);
		int pil = masuk.nextInt();
		if(pil == 1)
		{	System.out.print("Silahkan masukkan angka yang ingin dijumlah : ");
			int angka1 = masuk.nextInt();
			System.out.print("dengan ");
			int angka2 = masuk.nextInt();
			int hasil = angka1+angka2;
			System.out.println("Hasilnya = "+hasil);
		}	else if(pil == 2)
			{	System.out.print("Silahkan masukkan angka yang ingin dikurangi : ");
				int angka1 = masuk.nextInt();
				System.out.print("di kurangi dengan ");
				int angka2 = masuk.nextInt();
				int hasil = angka1-angka2;
				System.out.print("Hasilnya = "+hasil);
		}	else if(pil == 3)
			{	System.out.print("Silahkan masukkan angka yang ingin dikali : ");
				int angka1 = masuk.nextInt();
				System.out.print("di kali dengan ");
				int angka2 = masuk.nextInt();
				int hasil = angka1*angka2;
				System.out.print("Hasilnya = "+hasil);
		}	else if(pil == 4)
			{	System.out.print("Silahkan masukkan angka yang ingin dibagi : ");
				int angka1 = masuk.nextInt();
				System.out.print("dibagi dengan ");
				int angka2 = masuk.nextInt();
				double hasil = angka1/angka2;
				System.out.print("Hasilnya = "+hasil);
		}
		
		
		
		
	}
}