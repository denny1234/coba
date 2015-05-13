import java.util.Scanner;

class Tilang
{	int poin = 20;
	static int aaa()
	{	int poin = poin-0;
		return poin;
	}
	static int bbb()
	{	int poin = poin-1;
		return poin;
	}
	static int ccc()
	{	int poin = poin-2;
		return poin;
	}
	public static void main(String [] args)
	{	
		for (int i = 20; i == 0; i-=1);
		{	Scanner masuk = new Scanner(System.in);
			System.out.println("Masukkan kecepatan: ");
			int kecepatan = masuk.nextInt();
			if (kecepatan <= 60)
			{	int a = aaa();
				System.out.println("Poin Anda : "+a);
			}
				else if (kecepatan >= 80)
				{	int b = ccc();
					System.out.println("Poin Anda : "+b);
				}
					else
					{	int c = bbb();
						System.out.println("Poin Anda : "+c);
					}
			
			System.out.println("maaf SIM Anda harus dicabut permanen");
			
		}
	}
}