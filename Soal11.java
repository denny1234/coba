import java.util.Scanner;

public class Soalzz1{
	public static void main(String[] args)
	{	Scanner masuk = new Scanner(System.in);
		System.out.println("Masukkan Nama");
		String a = masuk.nextLine();
		System.out.println("Masukkan angka");
		int b = masuk.nextInt();
		Soal1 namaku = new Soal1(a,b);
		namaku.keterangan();
 }
} 