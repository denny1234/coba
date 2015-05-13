import java.util.Scanner;

class Frustasi
{	public static void main (String[] args)
	{	String nrp;
		Scanner masuk = new Scanner(System.in);
		System.out.print("Masukkan NRP: ");
		nrp = masuk.nextLine();
		
		String f = nrp.substring(0,1);
		int ff = Integer.parseInt(f);
		System.out.println(ff);
	}
}