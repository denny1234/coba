import java.util.Scanner;
class TryContSpecial
{	public static void main(String[] args)
	{	int tinggi, baris, kolom;
		String right = "O";
		Scanner masuk = new Scanner(System.in);
		System.out.print("Tinggi segitiga: ");
		tinggi = masuk.nextInt();
		for (baris = 1; baris <= tinggi; baris++)
		{	for (kolom = 1; kolom <= baris; kolom++)
				System.out.print(" ");
				for (kolom = 1; kolom <= (tinggi-baris); kolom++)
					System.out.print(right);
					System.out.println();
		}
		/*for (baris = 1; baris <= tinggi-1; baris++)
		{	for (kolom = 1; kolom <= baris; kolom++)
				System.out.print(" ");
				for (kolom = 1; kolom <= 2*(tinggi-baris)-1; kolom++)
					System.out.print(right);
					System.out.println();
		}*/
	}
}
