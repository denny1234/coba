import java.util.Scanner;

class Praktikum2
{	public static void main(String [] args)
	{	Scanner masuk = new Scanner(System.in);
		System.out.print("Masukkan bulan lahir : ");
		int a = masuk.nextInt();
		switch (a){
		case 1:
		System.out.println("Bulan Anda Januari");
		break;
		case 2:
		System.out.println("Bulan Anda Februari");
		break;
		case 3:
		System.out.println("Bulan Anda Maret");
		break;
		case 4:
		System.out.println("Bulan Anda April");
		break;
		case 5:
		System.out.println("Bulan Anda Mei");
		break;
		case 6:
		System.out.println("Bulan Anda Juni");
		break;
		case 7:
		System.out.println("Bulan Anda Juli");
		break;
		case 8:
		System.out.println("Bulan Anda Agustus");
		break;
		case 9:
		System.out.println("Bulan Anda September");
		break;
		case 10:
		System.out.println("Bulan Anda Oktober");
		break;
		case 11:
		System.out.println("Bulan Anda November");
		break;
		case 12:
		System.out.println("Bulan Anda Desember");
		break;
		default:
		System.out.println("Bulan apa itu hayooo?????");
		break;
		}	
		
		System.out.print("Masukkan umur: ");
		int b = masuk.nextInt();
		if(b>=0&&b<=5)
		{	System.out.println("Bayi");
		}	else if(b >= 6&&b<=10)
		{	System.out.println("Anak-anak");
		}	else if(b>=11&&b<=16)
		{	System.out.println("ABG");
		}	else if(b>=17&&b<=22)
		{	System.out.println("Remaja");
		}	else if(b>=23&&b<=55)
		{	System.out.println("Dewasa");
		}	else
		{	System.out.println("Lansia");
		}
	}
}