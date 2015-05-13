import java.util.Scanner;

class CuciMobil
{	public static void main (String[] args)
	{	System.out.println("Selamat datang di Cuci Mobil 'GOSOK BERSIH' ");
		System.out.println("Anda akan gratis cuci setiap 5 kali pencucian");
		System.out.println("Jika Anda member, akan mendapatkan diskon 20 persen");
		System.out.println("Jika Anda non-member, akan mendapatkan diskon 10 persen");
		
		Scanner masuk = new Scanner(System.in);
		System.out.println("Berapa kali Anda mencuci?");
		int a = masuk.nextInt();
		if (a == 5)
		{	System.out.println("Selamat Anda mendapatkan cuci gratis!!!");
		}
		else 
		{	System.out.println("Maaf Anda belum mendapatkan cci gratis!!!");
			System.out.println("Apakah Anda member??");
			System.out.println("1. YA		2.TIDAK");
			int b = masuk.nextInt();
			int normal = 50000;
			int c = (4*normal)/5;
			int d = (9*normal)/10;
			System.out.println("Harga normal = "+normal);
			if (b == 1)
			{	System.out.println("Diskon 20%, jadi Anda membayar : " + c+" rupiah");
				
			}
			else 
			{	System.out.println("Diskon 10%, jadi Anda membayar : " + d+" rupiah");
			}
		}
		
	}
	
}