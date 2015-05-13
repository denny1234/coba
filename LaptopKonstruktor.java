import java.util.Scanner;

public class Soal11{
	public static void main(String[] args)
	{	Scanner masuk = new Scanner(System.in);
		System.out.println("Masukkan Nama");
		String a = masuk.nextLine();
		//dipanggil secara otomatis pada instan class dan langsung diberi nilai
		Soal1 namaku = new soal1(a, b);
		namaku.keterangan();
 }
} 