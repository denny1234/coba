import java.util.Scanner;

class Praktikum2B
{	public static void main(String [] args)
	{	String bulan, umur;
		Scanner masuk = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.print("Masukkan bulan lahir Anda : ");
		int a = masuk.nextInt();
				if(a==1)
				{	bulan = "Januari";
				}	else if(a==2)
				{	bulan = "Februari";
				}	else if(a==3)
				{	bulan = "Maret";
				}	else if(a==4)
				{	bulan = "April";
				}	else if(a==5)
				{	bulan = "Mei";
				}	else if(a==6)
				{	bulan = "Juni";
				}	else if(a==7)
				{	bulan = "Juli";
				}	else if(a==8)	
				{	bulan = "Agustus";
				}	else if(a==9)
				{	bulan = "September";
				}	else if(a==10)
				{	bulan = "Oktober";
				}	else if(a==11)
				{	bulan = "November";
				}	else if(a==12)
				{	bulan = "Desember";
				}	else 
					bulan = "Bulan apa itu hayo...";
					System.out.println("Maka bulan lahir Anda adalah : "+bulan);
		
		System.out.println("-------------------------------");
		System.out.print("Masukkan Umur Anda saat ini : ");
		int b = masuk.nextInt();
		switch (b)
		{	case 0: case 1: case 2: case 3: case 4: case 5:
			umur = "Bayi";
			break;
			case 6: case 7: case 8: case 9: case 10:
			umur = "Anak-anak";
			break;
			case 11: case 12: case 13: case 14: case 15: case 16:
			umur = "ABG";
			break;
			case 17: case 18: case 19: case 20: case 21: case 22:
			umur = "Remaja";
			break;
			case 23: case 24: case 25: case 26: case 27:
			case 28: case 29: case 30: case 31: case 32:
			case 34: case 35: case 36: case 37: case 38:
			case 39: case 40: case 41: case 42: case 43:
			case 44: case 45: case 46: case 47: case 48:
			case 49: case 50: case 51: case 52: case 53: case 54:  case 55:
			umur = "Dewasa";
			break;
			default:
			umur = "Lansia";
			break;
		}
		System.out.println("Maka Anda termasuk golongan "+umur);
		System.out.print("-------------------------------------");
}
}