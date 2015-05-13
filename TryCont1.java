import java.util.Scanner;
class TryCont1
{	public static void main(String[] args)
	{	int tinggi, baris, kolom;
		String right = "*";
		Scanner masuk = new Scanner(System.in);
		System.out.print("Tinggi segitiga: ");
		tinggi = masuk.nextInt();
		for (baris = 1; baris <= tinggi; baris++)
		{	for (kolom = 1; kolom <= baris; kolom++)
					System.out.print(right);
					System.out.println();
				
				
								
			
		}	
	}
}
