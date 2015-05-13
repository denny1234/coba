import java.util.Scanner;
class Pets
{	public static void main(String [] args)
	{	int a;
		int b;
			Scanner masuk = new Scanner(System.in);
			System.out.println("Apakah anda member?");
			a = masuk.nextInt();
			if (a == "ya")
			{	System.out.println("Anda mendapat diskon 20 %, jadi Anda hanya membayar 80.000 rupiah");
			}	
				else
				{	System.out.println("Anda mendapat diskon 10 %, jadi Anda hanya membayar 90.000 rupiah");
				}
			System.out.println("Berapa kali Anda mencuci mobil???");
			b = masuk.nextInt();	
				if (b == 5)
				{	System.out.println("Selamat.. Anda mendapatkan 1 kali cuci gratis..");
				}
					else
					{	System.out.println("Anda harus cuci mobil 5 kali, jika ingin mendapatkan gratis cuci 1 kali...");
					}
			
		
	}

}